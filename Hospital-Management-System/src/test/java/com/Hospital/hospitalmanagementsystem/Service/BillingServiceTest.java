package com.Hospital.hospitalmanagementsystem.Service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.Hospital.hospitalmanagementsystem.Entity.*;
import com.Hospital.hospitalmanagementsystem.Exception.OneToOneException;
import com.Hospital.hospitalmanagementsystem.Repository.*;
import com.Hospital.hospitalmanagementsystem.Request.BillingRequest;
import jakarta.persistence.EntityNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class BillingServiceTest {

    @InjectMocks
    private BillingService billingService;

    @Mock
    private DoctorRepository doctorRepository;

    @Mock
    private PatientRepository patientRepository;

    @Mock
    private PrescriptionRepository prescriptionRepository;

    @Mock
    private ReceptionistRepository receptionistRepository;

    @Mock
    private BillingRepository billingRepository;

    private Doctor doctor;
    private Patient patient;
    private Receptionist receptionist;
    private Prescription prescription;

    @BeforeEach
    public void setUp() {
        doctor = new Doctor();
        doctor.setEmail("doctor@example.com");
        doctor.setDoctorPresent(true);

        patient = new Patient();
        patient.setEmail("patient@example.com");

        receptionist = new Receptionist();
        receptionist.setEmail("receptionist@example.com");

        prescription = new Prescription();
        prescription.setPrescriptionId(1);
        prescription.setMedicines(Collections.emptyList());
        prescription.setPrescriptionDate(java.sql.Date.valueOf("2023-10-15"));
    }

    @Test
    public void testGenerateBillSuccess() {
        BillingRequest billingRequest = new BillingRequest();
        billingRequest.setDoctorEmail("doctor@example.com");
        billingRequest.setPatientEmail("patient@example.com");
        billingRequest.setReceptionistEmail("receptionist@example.com");
        billingRequest.setPrescriptionId(1);
        billingRequest.setDoctorAmount(100.0);

        when(doctorRepository.findByEmail("doctor@example.com")).thenReturn(doctor);
        when(patientRepository.findByEmail("patient@example.com")).thenReturn(patient);
        when(receptionistRepository.findByEmail("receptionist@example.com")).thenReturn(receptionist);
        when(prescriptionRepository.findById(1)).thenReturn(prescription);
        when(billingRepository.existsByPrescription_PrescriptionId(1)).thenReturn(false);

        Double totalAmount = billingService.generateBill(billingRequest);

        assertEquals(100.0, totalAmount);
    }

    @Test
    public void testGenerateBillOneToOneException() {
        BillingRequest billingRequest = new BillingRequest();
        billingRequest.setPrescriptionId(1);

        when(billingRepository.existsByPrescription_PrescriptionId(1)).thenReturn(true);

        assertThrows(OneToOneException.class, () -> billingService.generateBill(billingRequest));
    }

    @Test
    public void testGenerateBillInvalidEmailOrPrescriptionId() {
        BillingRequest billingRequest = new BillingRequest();
        billingRequest.setDoctorEmail("nonexistent@example.com");
        billingRequest.setPatientEmail("patient@example.com");
        billingRequest.setReceptionistEmail("receptionist@example.com");
        billingRequest.setPrescriptionId(1);
        billingRequest.setDoctorAmount(100.0);

        when(doctorRepository.findByEmail("nonexistent@example.com")).thenReturn(null);

        assertThrows(EntityNotFoundException.class, () -> billingService.generateBill(billingRequest));
    }
}
