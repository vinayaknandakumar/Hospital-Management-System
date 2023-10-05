package com.Hospital.hospitalmanagementsystem.Service;

import com.Hospital.hospitalmanagementsystem.Entity.Billing;
import com.Hospital.hospitalmanagementsystem.Entity.Receptionist;
import com.Hospital.hospitalmanagementsystem.Exception.ValidationException;
import com.Hospital.hospitalmanagementsystem.Repository.BillingRepository;
import com.Hospital.hospitalmanagementsystem.Repository.ReceptionistRepository;
import com.Hospital.hospitalmanagementsystem.Request.ReceptionistRequest;
import com.Hospital.hospitalmanagementsystem.Response.ReceptionistResponse;
import jakarta.persistence.EntityNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mindrot.jbcrypt.BCrypt;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ReceptionistServiceTest {

    @InjectMocks
    private ReceptionistService receptionistService;

    @Mock
    private ReceptionistRepository receptionistRepository;

    @Mock
    private BillingRepository billingRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testLoginReceptionist_ValidCredentials() {
        ReceptionistRequest request = new ReceptionistRequest();
        request.setEmail("receptionist@example.com");
        request.setPassword("password");

        Receptionist receptionist = new Receptionist();
        receptionist.setEmail("receptionist@example.com");
        receptionist.setPassword(BCrypt.hashpw("password", BCrypt.gensalt()));

        when(receptionistRepository.findByEmail(request.getEmail())).thenReturn(receptionist);

        ReceptionistResponse response = receptionistService.loginReceptionist(request);

        assertNotNull(response);
        assertEquals("receptionist@example.com", response.getEmail());
    }

    @Test
    public void testLoginReceptionist_WrongPassword() {
        ReceptionistRequest request = new ReceptionistRequest();
        request.setEmail("receptionist@example.com");
        request.setPassword("wrong_password");

        Receptionist receptionist = new Receptionist();
        receptionist.setEmail("receptionist@example.com");
        receptionist.setPassword(BCrypt.hashpw("correct_password", BCrypt.gensalt()));

        when(receptionistRepository.findByEmail(request.getEmail())).thenReturn(receptionist);

        assertThrows(ValidationException.class, () -> receptionistService.loginReceptionist(request));
    }

    @Test
    public void testLoginReceptionist_NotRegistered() {
        ReceptionistRequest request = new ReceptionistRequest();
        request.setEmail("unknown@example.com");
        request.setPassword("password");

        when(receptionistRepository.findByEmail(request.getEmail())).thenReturn(null);

        assertThrows(ValidationException.class, () -> receptionistService.loginReceptionist(request));
    }

    @Test
    public void testGetBillDetails_BillExists() {
        String patientPhone = "1234567890";
        List<Billing> billingList = new ArrayList<>();
        billingList.add(new Billing());
        when(billingRepository.findByPatientPhone(patientPhone)).thenReturn(billingList);

        double totalAmount = receptionistService.getBillDetails(patientPhone);

        assertEquals(0.00, totalAmount); // Assuming all bills have been paid (paymentStatus=true)
    }

    @Test
    public void testGetBillDetails_NoBillExists() {
        String patientPhone = "1234567890";
        when(billingRepository.findByPatientPhone(patientPhone)).thenReturn(new ArrayList<>());

        assertThrows(EntityNotFoundException.class, () -> receptionistService.getBillDetails(patientPhone));
    }

    @Test
    public void testClearDues_NoBillingExists() {
        String patientPhone = "1234567890";
        when(billingRepository.findByPatientPhone(patientPhone)).thenReturn(new ArrayList<>());

        assertThrows(EntityNotFoundException.class, () -> receptionistService.clearDues(patientPhone));
    }

    @Test
    public void testClearDues_BillingExists() {
        String patientPhone = "1234567890";
        Billing billing = new Billing();
        billing.setPaymentStatus(false);
        List<Billing> billingList = new ArrayList<>();
        billingList.add(billing);

        when(billingRepository.findByPatientPhone(patientPhone)).thenReturn(billingList);

        receptionistService.clearDues(patientPhone);

        assertTrue(billing.isPaymentStatus());
        verify(billingRepository, times(1)).save(billing);
    }
}
