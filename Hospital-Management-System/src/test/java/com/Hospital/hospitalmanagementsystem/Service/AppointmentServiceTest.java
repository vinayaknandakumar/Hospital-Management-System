package com.Hospital.hospitalmanagementsystem.Service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.Hospital.hospitalmanagementsystem.Entity.Appointment;
import com.Hospital.hospitalmanagementsystem.Entity.Doctor;
import com.Hospital.hospitalmanagementsystem.Entity.Patient;
import com.Hospital.hospitalmanagementsystem.Exception.ValidationException;
import com.Hospital.hospitalmanagementsystem.Repository.AppointmentRepository;
import com.Hospital.hospitalmanagementsystem.Repository.DoctorRepository;
import com.Hospital.hospitalmanagementsystem.Repository.PatientRepository;
import com.Hospital.hospitalmanagementsystem.Request.AppointmentRequest;
import jakarta.persistence.EntityNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class AppointmentServiceTest {

    @InjectMocks
    private AppointmentService appointmentService;

    @Mock
    private AppointmentRepository appointmentRepository;

    @Mock
    private DoctorRepository doctorRepository;

    @Mock
    private PatientRepository patientRepository;

    private Doctor doctor;
    private Patient patient;
    private Appointment appointment;

    @BeforeEach
    public void setUp() {
        doctor = new Doctor();
        doctor.setEmail("doctor@example.com");
        doctor.setDoctorPresent(true);
        doctor.setDoctorId(1);

        patient = new Patient();
        patient.setEmail("patient@example.com");
        patient.setPatientId(1);

        appointment = new Appointment();
        appointment.setDoctor(doctor);
        appointment.setPatient(patient);

        java.util.Date utilDate = new java.util.Date(); // Create a java.util.Date
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime()); // Convert to java.sql.Date
        appointment.setAppointmentDate(sqlDate);

        appointment.setTreatmentStatus(false);
        appointment.setDoctorFreeStatus(true);
    }

    @Test
    public void testAddAppointmentSuccess() throws ParseException {
        AppointmentRequest appointmentRequest = new AppointmentRequest();
        appointmentRequest.setDoctorEmail("doctor@example.com");
        appointmentRequest.setPatientEmail("patient@example.com");
        appointmentRequest.setAppointmentDate("2023-10-15");
        appointmentRequest.setAppointmentSlots(1);

        when(doctorRepository.findByDoctorPresent(true)).thenReturn(Collections.singletonList(doctor));
        when(patientRepository.findByEmail("patient@example.com")).thenReturn(patient);
        when(appointmentRepository.findAll()).thenReturn(Collections.emptyList()); // No existing appointments

        assertDoesNotThrow(() -> appointmentService.addAppointment(appointmentRequest));
    }

    @Test
    public void testAddAppointmentDoctorNotFound() {
        AppointmentRequest appointmentRequest = new AppointmentRequest();
        appointmentRequest.setDoctorEmail("nonexistent@example.com");
        appointmentRequest.setPatientEmail("patient@example.com");
        appointmentRequest.setAppointmentDate("2023-10-15");
        appointmentRequest.setAppointmentSlots(1);

        when(doctorRepository.findByDoctorPresent(true)).thenReturn(Collections.singletonList(doctor));

        assertThrows(EntityNotFoundException.class, () -> appointmentService.addAppointment(appointmentRequest));
    }

    @Test
    public void testAddAppointmentPatientNotFound() {
        AppointmentRequest appointmentRequest = new AppointmentRequest();
        appointmentRequest.setDoctorEmail("doctor@example.com");
        appointmentRequest.setPatientEmail("nonexistent@example.com");
        appointmentRequest.setAppointmentDate("2023-10-15");
        appointmentRequest.setAppointmentSlots(1);

        when(doctorRepository.findByDoctorPresent(true)).thenReturn(Collections.singletonList(doctor));
        when(patientRepository.findByEmail("nonexistent@example.com")).thenReturn(null);

        assertThrows(EntityNotFoundException.class, () -> appointmentService.addAppointment(appointmentRequest));
    }

    @Test
    public void testAddAppointmentAppointmentAlreadyScheduled() {
        AppointmentRequest appointmentRequest = new AppointmentRequest();
        appointmentRequest.setDoctorEmail("doctor@example.com");
        appointmentRequest.setPatientEmail("patient@example.com");
        appointmentRequest.setAppointmentDate("2023-10-15");
        appointmentRequest.setAppointmentSlots(1);

        List<Appointment> existingAppointments = new ArrayList<>();
        existingAppointments.add(appointment);

        when(doctorRepository.findByDoctorPresent(true)).thenReturn(Collections.singletonList(doctor));
        when(patientRepository.findByEmail("patient@example.com")).thenReturn(patient);
        when(appointmentRepository.findAll()).thenReturn(existingAppointments);

        assertThrows(ValidationException.class, () -> appointmentService.addAppointment(appointmentRequest));
    }
}
