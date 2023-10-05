package com.Hospital.hospitalmanagementsystem.Service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.Hospital.hospitalmanagementsystem.Entity.Admin;
import com.Hospital.hospitalmanagementsystem.Entity.Doctor;
import com.Hospital.hospitalmanagementsystem.Entity.Patient;
import com.Hospital.hospitalmanagementsystem.Entity.Receptionist;
import com.Hospital.hospitalmanagementsystem.Exception.ValidationException;
import com.Hospital.hospitalmanagementsystem.Repository.AdminRepository;
import com.Hospital.hospitalmanagementsystem.Repository.DoctorRepository;
import com.Hospital.hospitalmanagementsystem.Repository.PatientRepository;
import com.Hospital.hospitalmanagementsystem.Repository.ReceptionistRepository;
import com.Hospital.hospitalmanagementsystem.Request.AdminRequest;
import com.Hospital.hospitalmanagementsystem.Response.AdminResponse;
import com.Hospital.hospitalmanagementsystem.Response.DoctorResponse;
import com.Hospital.hospitalmanagementsystem.Response.PatientResponse;
import com.Hospital.hospitalmanagementsystem.Response.ReceptionistResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mindrot.jbcrypt.BCrypt;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class AdminServiceTest {

    @InjectMocks
    private AdminService adminService;

    @Mock
    private AdminRepository adminRepository;

    @Mock
    private DoctorRepository doctorRepository;

    @Mock
    private PatientRepository patientRepository;

    @Mock
    private ReceptionistRepository receptionistRepository;

    private Admin admin;
    private Doctor doctor;
    private Patient patient;
    private Receptionist receptionist;

    @BeforeEach
    public void setUp() {
        admin = new Admin();
        admin.setEmail("admin@example.com");
        admin.setPassword(BCrypt.hashpw("password", BCrypt.gensalt()));

        doctor = new Doctor();
        doctor.setEmail("doctor@example.com");

        patient = new Patient();
        patient.setEmail("patient@example.com");

        receptionist = new Receptionist();
        receptionist.setEmail("receptionist@example.com");
    }

    @Test
    public void testAdminLoginValidCredentials() {
        AdminRequest adminRequest = new AdminRequest();
        adminRequest.setEmail("admin@example.com");
        adminRequest.setPassword("password");

        when(adminRepository.findByEmail(any())).thenReturn(admin);

        AdminResponse adminResponse = adminService.adminLogin(adminRequest);

        assertNotNull(adminResponse);
        assertEquals("admin@example.com", adminResponse.getEmail());
    }

    @Test
    public void testAdminLoginInvalidCredentials() {
        AdminRequest adminRequest = new AdminRequest();
        adminRequest.setEmail("admin@example.com");
        adminRequest.setPassword("invalidPassword");

        when(adminRepository.findByEmail(any())).thenReturn(admin);

        assertThrows(ValidationException.class, () -> adminService.adminLogin(adminRequest));
    }

    @Test
    public void testAdminLoginUserNotRegistered() {
        AdminRequest adminRequest = new AdminRequest();
        adminRequest.setEmail("nonexistent@example.com");
        adminRequest.setPassword("password");

        when(adminRepository.findByEmail(any())).thenReturn(null);

        assertThrows(ValidationException.class, () -> adminService.adminLogin(adminRequest));
    }

    @Test
    public void testRemoveDoctor() {
        when(doctorRepository.findByEmail(any())).thenReturn(doctor);

        adminService.removeDoctor("doctor@example.com");

        assertFalse(doctor.isDoctorPresent());
        verify(doctorRepository, times(1)).save(doctor);
    }

    @Test
    public void testRemoveDoctorDoctorNotFound() {
        when(doctorRepository.findByEmail(any())).thenReturn(null);

        assertThrows(ValidationException.class, () -> adminService.removeDoctor("doctor@example.com"));
    }

    @Test
    public void testGetAllDoctors() {
        List<Doctor> doctorList = new ArrayList<>();
        doctorList.add(doctor);

        when(doctorRepository.findByDoctorPresent(true)).thenReturn(doctorList);

        List<DoctorResponse> doctorResponses = adminService.getAllDoctors();

        assertEquals(1, doctorResponses.size());
        assertEquals("doctor@example.com", doctorResponses.get(0).getEmail());
    }

    @Test
    public void testGetAllPatients() {
        List<Patient> patientList = new ArrayList<>();
        patientList.add(patient);

        when(patientRepository.findAll()).thenReturn(patientList);

        List<PatientResponse> patientResponses = adminService.getAllPatients();

        assertEquals(1, patientResponses.size());
        assertEquals("patient@example.com", patientResponses.get(0).getEmail());
    }

    @Test
    public void testGetAllReceptionists() {
        List<Receptionist> receptionists = new ArrayList<>();
        receptionists.add(receptionist);

        when(receptionistRepository.findAll()).thenReturn(receptionists);

        List<ReceptionistResponse> receptionistResponses = adminService.getAllReceptionists();

        assertEquals(1, receptionistResponses.size());
        assertEquals("receptionist@example.com", receptionistResponses.get(0).getEmail());
    }
}
