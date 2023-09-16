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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private ReceptionistRepository receptionistRepository;

    public void registerStaff(RegisterRequest registerRequest){

        if(registerRequest.getRole().equals("admin")){
            Admin admin = new Admin();
            admin.setFirstName(registerRequest.getFirstName());
            admin.setLastName(registerRequest.getLastName());
            admin.setEmail(registerRequest.getEmail());
            admin.setPassword(registerRequest.getPassword());
            adminRepository.save(admin);
        }
        else if (registerRequest.getRole().equals("doctor")){
            Doctor doctor = new Doctor();
            doctor.setFirstName(registerRequest.getFirstName());
            doctor.setLastName(registerRequest.getLastName());
            doctor.setEmail(registerRequest.getEmail());
            doctor.setGender(registerRequest.getGender());
            doctor.setSpecialization(registerRequest.getSpecialization());
            doctor.setDoctorPresent(true);
            doctor.setPassword(registerRequest.getPassword());
            doctorRepository.save(doctor);
        }
        else if (registerRequest.getRole().equals("patient")){
            Patient patient = new Patient();
            patient.setFirstName(registerRequest.getFirstName());
            patient.setLastName(registerRequest.getLastName());
            patient.setAge(registerRequest.getAge());
            patient.setGender(registerRequest.getGender());
            patient.setPhone(registerRequest.getPhone());
            patient.setPassword(registerRequest.getPassword());
            patient.setAddress(registerRequest.getAddress());
            patientRepository.save(patient);
        }
        else if(registerRequest.getRole().equals("receptionist")){
            Receptionist receptionist = new Receptionist();
            receptionist.setFirstName(registerRequest.getFirstName());
            receptionist.setLastName(registerRequest.getLastName());
            receptionist.setGender(registerRequest.getGender());
            receptionist.setPhone(registerRequest.getPhone());
            receptionist.setPassword(registerRequest.getPassword());
            receptionistRepository.save(receptionist);
        }
        else {
            throw new IllegalArgumentException("Invalid Role - "+ registerRequest.getRole());
        }
    }

}
