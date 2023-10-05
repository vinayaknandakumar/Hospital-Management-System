package com.Hospital.hospitalmanagementsystem.Service;

import com.Hospital.hospitalmanagementsystem.Entity.Admin;
import com.Hospital.hospitalmanagementsystem.Entity.Doctor;
import com.Hospital.hospitalmanagementsystem.Entity.Patient;
import com.Hospital.hospitalmanagementsystem.Entity.Receptionist;
import com.Hospital.hospitalmanagementsystem.Repository.AdminRepository;
import com.Hospital.hospitalmanagementsystem.Repository.DoctorRepository;
import com.Hospital.hospitalmanagementsystem.Repository.PatientRepository;
import com.Hospital.hospitalmanagementsystem.Repository.ReceptionistRepository;
import com.Hospital.hospitalmanagementsystem.Request.RegisterRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mock.web.MockMultipartFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import static org.mockito.Mockito.*;

public class RegisterServiceTest {

    @InjectMocks
    private RegisterService registerService;

    @Mock
    private AdminRepository adminRepository;

    @Mock
    private DoctorRepository doctorRepository;

    @Mock
    private PatientRepository patientRepository;

    @Mock
    private ReceptionistRepository receptionistRepository;

    @Mock
    private JavaMailSender mailSender;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testRegisterAdmin() {
        // Create a RegisterRequest object for an admin
        RegisterRequest registerRequest = new RegisterRequest();
        registerRequest.setRole("admin");
        // Set other properties for the registerRequest

        // Mock the behavior of adminRepository.save()
        when(adminRepository.save(any(Admin.class))).thenReturn(new Admin()); // Return a new Admin object

        // Call the method to be tested
        registerService.registerStaff(registerRequest);

        // Verify that adminRepository.save() was called with the expected Admin object
        verify(adminRepository).save(any(Admin.class));

        // Verify that mailSender.send() was called with the expected SimpleMailMessage
        verify(mailSender).send(any(SimpleMailMessage.class));
    }

    @Test
    public void testRegisterDoctor() {
        RegisterRequest registerRequest = new RegisterRequest();
        registerRequest.setRole("doctor");
        when(doctorRepository.save(any(Doctor.class))).thenReturn(new Doctor());
        registerService.registerStaff(registerRequest);
        verify(doctorRepository).save(any(Doctor.class));
        verify(mailSender).send(any(SimpleMailMessage.class));
    }

    @Test
    public void testRegisterPatient() {

        RegisterRequest registerRequest = new RegisterRequest();
        registerRequest.setRole("patient");
        when(patientRepository.save(any(Patient.class))).thenReturn(new Patient());
        registerService.registerStaff(registerRequest);
        verify(patientRepository).save(any(Patient.class));
        verify(mailSender).send(any(SimpleMailMessage.class));
    }

    @Test
    public void testRegisterReceptionist() {
        RegisterRequest registerRequest = new RegisterRequest();
        registerRequest.setRole("receptionist");
        when(receptionistRepository.save(any(Receptionist.class))).thenReturn(new Receptionist());
        registerService.registerStaff(registerRequest);
        verify(receptionistRepository).save(any(Receptionist.class));
        verify(mailSender).send(any(SimpleMailMessage.class));
    }

    @Test
    void testRegisterPatientFromExcel() throws IOException {
        // Mock the MultipartFile
        File file = new File("D:\\HospitalManagementSystem\\Hospital-Management-System\\src\\main\\resources\\details.xlsx");
        FileInputStream fileInputStream = new FileInputStream(file);
        MockMultipartFile mockMultipartFile = new MockMultipartFile("file", file.getName(), "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", fileInputStream);

        // Mock the behavior of patientRepository
        when(patientRepository.save(any())).thenReturn(new Patient());

        // Call the method
        registerService.registerPatientFromExcel(mockMultipartFile);

        // Verify that patientRepository.save() was called exactly row times
        verify(patientRepository, times(1)).save(any());

    }



}

