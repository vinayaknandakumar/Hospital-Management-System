package com.Hospital.hospitalmanagementsystem.Service;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import com.Hospital.hospitalmanagementsystem.Entity.Patient;
import com.Hospital.hospitalmanagementsystem.Exception.ValidationException;
import com.Hospital.hospitalmanagementsystem.Repository.PatientRepository;
import com.Hospital.hospitalmanagementsystem.Request.PatientRequest;
import com.Hospital.hospitalmanagementsystem.Response.PatientResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mindrot.jbcrypt.BCrypt;

@ExtendWith(MockitoExtension.class)
public class PatientServiceTest {

    @InjectMocks
    private PatientService patientService;

    @Mock
    private PatientRepository patientRepository;

    @BeforeEach
    public void setUp() {
    }

    @Test
    public void testPatientLoginSuccess() {
        // Create a PatientRequest
        PatientRequest patientRequest = new PatientRequest();
        patientRequest.setEmail("patient@example.com");
        patientRequest.setPassword("password"); // Password should be hashed, but for testing, plain text is used here

        // Create a mocked Patient object
        Patient patient = new Patient();
        patient.setEmail("patient@example.com");
        patient.setFirstName("John");
        patient.setLastName("Doe");
        patient.setPassword(BCrypt.hashpw("password", BCrypt.gensalt())); // Hashed password

        // Mock the behavior of the patientRepository.findByEmail method
        when(patientRepository.findByEmail("patient@example.com")).thenReturn(patient);

        // Call the service method
        PatientResponse response = assertDoesNotThrow(() -> patientService.patientLogin(patientRequest));

        // Verify that the response contains the correct patient information
        assertEquals("patient@example.com", response.getEmail());
        assertEquals("John", response.getFirstName());
        assertEquals("Doe", response.getLastName());
    }

    @Test
    public void testPatientLoginWrongPassword() {
        // Create a PatientRequest
        PatientRequest patientRequest = new PatientRequest();
        patientRequest.setEmail("patient@example.com");
        patientRequest.setPassword("wrongpassword"); // Wrong password

        // Create a mocked Patient object with the correct email but a different password
        Patient patient = new Patient();
        patient.setEmail("patient@example.com");
        patient.setPassword(BCrypt.hashpw("correctpassword", BCrypt.gensalt())); // Hashed password

        // Mock the behavior of the patientRepository.findByEmail method
        when(patientRepository.findByEmail("patient@example.com")).thenReturn(patient);

        // Call the service method and expect a ValidationException with wrong password
        assertThrows(ValidationException.class, () -> patientService.patientLogin(patientRequest));
    }

    @Test
    public void testPatientLoginPatientNotRegistered() {
        // Create a PatientRequest with an email for a non-existent patient
        PatientRequest patientRequest = new PatientRequest();
        patientRequest.setEmail("nonexistent@example.com");
        patientRequest.setPassword("password");

        // Mock the behavior of the patientRepository.findByEmail method to return null
        when(patientRepository.findByEmail("nonexistent@example.com")).thenReturn(null);

        // Call the service method and expect a ValidationException with Patient not registered
        assertThrows(ValidationException.class, () -> patientService.patientLogin(patientRequest));
    }
}
