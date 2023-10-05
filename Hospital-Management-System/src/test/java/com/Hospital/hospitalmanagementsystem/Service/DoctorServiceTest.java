package com.Hospital.hospitalmanagementsystem.Service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.Hospital.hospitalmanagementsystem.Entity.Doctor;
import com.Hospital.hospitalmanagementsystem.Exception.ValidationException;
import com.Hospital.hospitalmanagementsystem.Repository.DoctorRepository;
import com.Hospital.hospitalmanagementsystem.Request.DoctorRequest;
import com.Hospital.hospitalmanagementsystem.Response.DoctorResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mindrot.jbcrypt.BCrypt;

@ExtendWith(MockitoExtension.class)
public class DoctorServiceTest {

    @InjectMocks
    private DoctorService doctorService;

    @Mock
    private DoctorRepository doctorRepository;

    private Doctor doctor;

    @BeforeEach
    public void setUp() {
        doctor = new Doctor();
        doctor.setEmail("doctor@example.com");
        doctor.setPassword(BCrypt.hashpw("password123", BCrypt.gensalt()));
        doctor.setFirstName("John");
        doctor.setLastName("Doe");
    }

    @Test
    public void testLoginDoctorSuccess() {
        DoctorRequest doctorRequest = new DoctorRequest();
        doctorRequest.setEmail("doctor@example.com");
        doctorRequest.setPassword("password123");

        when(doctorRepository.findByEmail("doctor@example.com")).thenReturn(doctor);

        DoctorResponse doctorResponse = doctorService.loginDoctor(doctorRequest);

        assertEquals("doctor@example.com", doctorResponse.getEmail());
        assertEquals("John", doctorResponse.getFirstName());
        assertEquals("Doe", doctorResponse.getLastName());
    }

    @Test
    public void testLoginDoctorWrongPassword() {
        DoctorRequest doctorRequest = new DoctorRequest();
        doctorRequest.setEmail("doctor@example.com");
        doctorRequest.setPassword("wrongpassword");

        when(doctorRepository.findByEmail("doctor@example.com")).thenReturn(doctor);

        assertThrows(ValidationException.class, () -> doctorService.loginDoctor(doctorRequest));
    }

    @Test
    public void testLoginDoctorDoctorNotRegistered() {
        DoctorRequest doctorRequest = new DoctorRequest();
        doctorRequest.setEmail("nonexistent@example.com");
        doctorRequest.setPassword("password123");

        when(doctorRepository.findByEmail("nonexistent@example.com")).thenReturn(null);

        assertThrows(ValidationException.class, () -> doctorService.loginDoctor(doctorRequest));
    }
}
