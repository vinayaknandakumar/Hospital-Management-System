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
import jakarta.persistence.NonUniqueResultException;
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

    private int validateFirstName(String firstName){
        if(firstName==null || firstName.trim().isEmpty()){
            throw new IllegalArgumentException("First Name can't be empty");
        }
        else {
            return 1;
        }
    }

    private int validateLastName(String lastName){
        if(lastName==null||lastName.trim().isEmpty()){
            throw new IllegalArgumentException("Last name can't be empty");
        }
        else {
            return 1;
        }
    }

    private int validateEmail(String email){
        if(email==null || email.trim().isEmpty()){
            throw new IllegalArgumentException("Email can't be empty");
        }
        else if(!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")){
            throw new IllegalArgumentException("Invalid email provided");
        }
        else if(adminRepository.findByEmail(email)!=null){
            throw new NonUniqueResultException("Email already in use");
        }
        else {
            return 1;
        }
    }

    private int validatePassword(String password){
        if(password.length()<4 || password.length()>8){
            throw new IllegalArgumentException("Password must contain more than 3 characters and less than 8 characters");
        }
        else {
            return 1;
        }
    }

    private int validatePhone(String phoneNumber){
        if(phoneNumber==null || phoneNumber.length()!=10){
            throw new IllegalArgumentException("Invalid phone number");
        }
        else {
            return 1;
        }
    }

    public void registerStaff(RegisterRequest registerRequest){

        if(registerRequest.getRole().equals("admin")){
            Admin admin = new Admin();
            if (validateFirstName(registerRequest.getFirstName())==1){
                admin.setFirstName(registerRequest.getFirstName());
            }
            if(validateLastName(registerRequest.getLastName())==1){
                admin.setLastName(registerRequest.getLastName());
            }
            if(validateEmail(registerRequest.getEmail())==1){
                admin.setEmail(registerRequest.getEmail());
            }
            if (validatePassword(registerRequest.getPassword())==1){
                admin.setPassword(registerRequest.getPassword());
            }
            adminRepository.save(admin);
        }
        else if (registerRequest.getRole().equals("doctor")){
            Doctor doctor = new Doctor();
            if(validateFirstName(registerRequest.getFirstName())==1){
                doctor.setFirstName(registerRequest.getFirstName());
            }
            if(validateLastName(registerRequest.getLastName())==1){
                doctor.setLastName(registerRequest.getLastName());
            }
            if(validateEmail(registerRequest.getEmail())==1){
                doctor.setEmail(registerRequest.getEmail());
            }
            doctor.setGender(registerRequest.getGender());
            doctor.setSpecialization(registerRequest.getSpecialization());
            doctor.setDoctorPresent(true);
            if(validatePassword(registerRequest.getPassword())==1){
                doctor.setPassword(registerRequest.getPassword());
            }
            doctorRepository.save(doctor);
        }
        else if (registerRequest.getRole().equals("patient")){
            Patient patient = new Patient();
            if(validateFirstName(registerRequest.getFirstName())==1){
                patient.setFirstName(registerRequest.getFirstName());
            }
            if(validateLastName(registerRequest.getLastName())==1){
                patient.setLastName(registerRequest.getLastName());
            }
            patient.setAge(registerRequest.getAge());
            patient.setGender(registerRequest.getGender());
            if(validatePhone(registerRequest.getPhone())==1){
                patient.setPhone(registerRequest.getPhone());
            }
            if(validatePassword(registerRequest.getPassword())==1){
                patient.setPassword(registerRequest.getPassword());
            }
            patient.setAddress(registerRequest.getAddress());
            patientRepository.save(patient);
        }
        else if(registerRequest.getRole().equals("receptionist")){
            Receptionist receptionist = new Receptionist();
            if(validateFirstName(receptionist.getFirstName())==1){
                receptionist.setFirstName(registerRequest.getFirstName());
            }
            if(validateLastName(registerRequest.getLastName())==1){
                receptionist.setLastName(registerRequest.getLastName());
            }
            receptionist.setGender(registerRequest.getGender());
            if(validatePhone(registerRequest.getPhone())==1){
                receptionist.setPhone(registerRequest.getPhone());
            }
            if(validatePassword(registerRequest.getPassword())==1){
                receptionist.setPassword(registerRequest.getPassword());
            }
            receptionistRepository.save(receptionist);
        }
        else {
            throw new IllegalArgumentException("Invalid Role : "+ registerRequest.getRole());
        }
    }

}
