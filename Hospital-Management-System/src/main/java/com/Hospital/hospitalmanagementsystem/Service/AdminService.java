package com.Hospital.hospitalmanagementsystem.Service;

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
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminService {

   @Autowired
   private AdminRepository adminRepository;
   @Autowired
   private DoctorRepository doctorRepository;
   @Autowired
   private PatientRepository patientRepository;
   @Autowired
   private ReceptionistRepository receptionistRepository;


    public AdminResponse adminLogin(AdminRequest adminRequest) {
        Admin admin;
        AdminResponse adminResponse = new AdminResponse();
        admin = adminRepository.findByEmail(adminRequest.getEmail());
        if (admin != null) {
            if (BCrypt.checkpw(adminRequest.getPassword(), admin.getPassword())) {
                adminResponse.setFirstName(admin.getFirstName());
                adminResponse.setLastName(admin.getLastName());
                adminResponse.setEmail(admin.getEmail());
                return adminResponse;
            }
            throw new ValidationException("Wrong password");
        }
        throw new ValidationException("User not registered");
    }

    public void removeDoctor(String email){
        Doctor doctor = doctorRepository.findByEmail(email);
        if (doctor != null){
            doctor.setDoctorPresent(false);
            doctorRepository.save(doctor);
        }
        else {
            throw new ValidationException("No doctor with the specified email");
        }

    }

    public List<DoctorResponse> getAllDoctors(){
        List<Doctor> doctorList = doctorRepository.findByDoctorPresent(true);
        List<DoctorResponse> doctorResponses = new ArrayList<>();
        for (Doctor doctor : doctorList){
            DoctorResponse doctorResponse = new DoctorResponse();
            doctorResponse.setFirstName(doctor.getFirstName());
            doctorResponse.setLastName(doctor.getLastName());
            doctorResponse.setEmail(doctor.getEmail());
            doctorResponses.add(doctorResponse);
        }
        return doctorResponses;
    }

    public List<PatientResponse> getAllPatients(){
        List<Patient> patientList = patientRepository.findAll();
        List<PatientResponse> patientResponses = new ArrayList<>();
        for (Patient patient : patientList){
            PatientResponse patientResponse = new PatientResponse();
            patientResponse.setFirstName(patient.getFirstName());
            patientResponse.setLastName(patient.getLastName());
            patientResponse.setEmail(patient.getEmail());
            patientResponses.add(patientResponse);
        }
        return patientResponses;
    }

    public List<ReceptionistResponse> getAllReceptionists(){
        List<Receptionist> receptionists = receptionistRepository.findAll();
        List<ReceptionistResponse> receptionistResponses = new ArrayList<>();
        for(Receptionist receptionist : receptionists){
            ReceptionistResponse receptionistResponse = new ReceptionistResponse();
            receptionistResponse.setFirstName(receptionist.getFirstName());
            receptionistResponse.setLastName(receptionist.getLastName());
            receptionistResponse.setEmail(receptionist.getEmail());
            receptionistResponses.add(receptionistResponse);
        }
        return receptionistResponses;
    }
}
