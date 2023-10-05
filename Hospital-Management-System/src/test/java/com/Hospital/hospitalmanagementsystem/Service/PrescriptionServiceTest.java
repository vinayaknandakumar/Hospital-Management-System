package com.Hospital.hospitalmanagementsystem.Service;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import com.Hospital.hospitalmanagementsystem.Entity.*;
import com.Hospital.hospitalmanagementsystem.Exception.*;
import com.Hospital.hospitalmanagementsystem.Repository.*;
import com.Hospital.hospitalmanagementsystem.Request.PrescriptionRequest;
import com.Hospital.hospitalmanagementsystem.Response.PrescriptionResponse;
import jakarta.persistence.EntityNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.Date;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class PrescriptionServiceTest {

    @InjectMocks
    private PrescriptionService prescriptionService;

    @Mock
    private PrescriptionRepository prescriptionRepository;

    @Mock
    private DoctorRepository doctorRepository;

    @Mock
    private PatientRepository patientRepository;

    @Mock
    private MedicineRepository medicineRepository;

    @Mock
    private AppointmentRepository appointmentRepository;

    private Doctor doctor;
    private Patient patient;
    private Appointment appointment;
    private List<Medicine> medicineList;

    @BeforeEach
    public void setUp() {
        doctor = new Doctor();
        doctor.setEmail("doctor@example.com");
        doctor.setDoctorPresent(true);
        doctor.setDoctorId(1);

        patient = new Patient();
        patient.setEmail("patient@example.com");
        patient.setPatientId(1);

        java.util.Date utilDate = new java.util.Date(); // Create a java.util.Date
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime()); // Convert to java.sql.Date

        appointment = new Appointment();
        appointment.setDoctor(doctor);
        appointment.setPatient(patient);
        appointment.setAppointmentDate(sqlDate);

        // Use not null medicine names
        medicineList = Arrays.asList(
                new Medicine("Medicine1", 10.0),
                new Medicine("Medicine2", 20.0)
        );
    }

    @Test
    public void testAddPrescriptionDoctorNotFound() {
        PrescriptionRequest prescriptionRequest = new PrescriptionRequest();
        prescriptionRequest.setDoctorEmail("nonexistent@example.com");
        prescriptionRequest.setPatientEmail("patient@example.com");
        prescriptionRequest.setMedicines(Arrays.asList("Dolo","Paracetamol"));
        prescriptionRequest.setPrescriptionData("Prescription data");

        when(doctorRepository.findByDoctorPresent(true)).thenReturn(Collections.singletonList(doctor));

        assertThrows(EntityNotFoundException.class, () -> prescriptionService.addPrescription(prescriptionRequest));
    }

    @Test
    public void testAddPrescriptionPatientNotFound() {
        PrescriptionRequest prescriptionRequest = new PrescriptionRequest();
        prescriptionRequest.setDoctorEmail("doctor@example.com");
        prescriptionRequest.setPatientEmail("nonexistent@example.com");
        prescriptionRequest.setMedicines(Arrays.asList("Medicine1", "Medicine2"));
        prescriptionRequest.setPrescriptionData("Prescription data");

        when(doctorRepository.findByDoctorPresent(true)).thenReturn(Collections.singletonList(doctor));
        when(patientRepository.findByEmail("nonexistent@example.com")).thenReturn(null);

        assertThrows(EntityNotFoundException.class, () -> prescriptionService.addPrescription(prescriptionRequest));
    }

    @Test
    public void testAddPrescriptionAppointmentNotFound() {
        PrescriptionRequest prescriptionRequest = new PrescriptionRequest();
        prescriptionRequest.setDoctorEmail("doctor@example.com");
        prescriptionRequest.setPatientEmail("patient@example.com");
        prescriptionRequest.setMedicines(Arrays.asList("Medicine1", "Medicine2"));
        prescriptionRequest.setPrescriptionData("Prescription data");

        when(doctorRepository.findByDoctorPresent(true)).thenReturn(Collections.singletonList(doctor));
        when(patientRepository.findByEmail("patient@example.com")).thenReturn(patient);
        when(appointmentRepository.findAll()).thenReturn(Collections.singletonList(appointment));
        when(prescriptionRepository.existsByAppointment_AppointmentId(appointment.getAppointmentId())).thenReturn(false);

        assertThrows(EntityNotFoundException.class, () -> prescriptionService.addPrescription(prescriptionRequest));
    }

    @Test
    public void testAddPrescriptionPrescriptionExists() {
        PrescriptionRequest prescriptionRequest = new PrescriptionRequest();
        prescriptionRequest.setDoctorEmail("doctor@example.com");
        prescriptionRequest.setPatientEmail("patient@example.com");
        prescriptionRequest.setMedicines(Arrays.asList("Medicine1", "Medicine2"));
        prescriptionRequest.setPrescriptionData("Prescription data");

        when(doctorRepository.findByDoctorPresent(true)).thenReturn(Collections.singletonList(doctor));
        when(patientRepository.findByEmail("patient@example.com")).thenReturn(patient);
        when(appointmentRepository.findAll()).thenReturn(Collections.singletonList(appointment));
        when(prescriptionRepository.existsByAppointment_AppointmentId(appointment.getAppointmentId())).thenReturn(true);

        assertThrows(OneToOneException.class, () -> prescriptionService.addPrescription(prescriptionRequest));
    }

    @Test
    public void testAddPrescriptionInvalidMedicine() {
        PrescriptionRequest prescriptionRequest = new PrescriptionRequest();
        prescriptionRequest.setDoctorEmail("doctor@example.com");
        prescriptionRequest.setPatientEmail("patient@example.com");
        prescriptionRequest.setMedicines(Arrays.asList("Medicine3", "Medicine4")); // Medicine3 and Medicine4 are not in medicineList
        prescriptionRequest.setPrescriptionData("Prescription data");

        when(doctorRepository.findByDoctorPresent(true)).thenReturn(Collections.singletonList(doctor));
        when(patientRepository.findByEmail("patient@example.com")).thenReturn(patient);
        when(appointmentRepository.findAll()).thenReturn(Collections.singletonList(appointment));
        when(prescriptionRepository.existsByAppointment_AppointmentId(appointment.getAppointmentId())).thenReturn(false);
        when(medicineRepository.findAll()).thenReturn(medicineList);

        assertThrows(NullPointerException.class, () -> prescriptionService.addPrescription(prescriptionRequest));
    }
}
