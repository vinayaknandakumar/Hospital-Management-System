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
import io.micrometer.common.util.StringUtils;
import jakarta.persistence.NonUniqueResultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.mindrot.jbcrypt.BCrypt;

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


    /**
     * for registration of admin, doctor, patient and receptionist
     * @param registerRequest
     */
    public void registerStaff(RegisterRequest registerRequest) {

        if (registerRequest.getRole().equalsIgnoreCase("admin")) {
            Admin admin = new Admin();
            admin.setFirstName(registerRequest.getFirstName());
            admin.setLastName(registerRequest.getLastName());
            admin.setEmail(registerRequest.getEmail());
            admin.setPhone(registerRequest.getPhone());
            admin.setPassword(BCrypt.hashpw(registerRequest.getPassword(), BCrypt.gensalt()));
            adminRepository.save(admin);
        } else if (registerRequest.getRole().equals("doctor")) {
            Doctor doctor = new Doctor();
            doctor.setFirstName(registerRequest.getFirstName());
            doctor.setLastName(registerRequest.getLastName());
            doctor.setEmail(registerRequest.getEmail());
            doctor.setPhone(registerRequest.getPhone());
            doctor.setGender(registerRequest.getGender());
            doctor.setSpecialization(registerRequest.getSpecialization());
            doctor.setDoctorPresent(true);
            doctor.setPassword(BCrypt.hashpw(registerRequest.getPassword(), BCrypt.gensalt()));
            doctorRepository.save(doctor);
        } else if (registerRequest.getRole().equals("patient")) {
            Patient patient = new Patient();
            patient.setFirstName(registerRequest.getFirstName());
            patient.setLastName(registerRequest.getLastName());
            patient.setAge(registerRequest.getAge());
            patient.setGender(registerRequest.getGender());
            patient.setPhone(registerRequest.getPhone());
            patient.setEmail(registerRequest.getEmail());
            patient.setPassword(BCrypt.hashpw(registerRequest.getPassword(), BCrypt.gensalt()));
            patient.setAddress(registerRequest.getAddress());
            patientRepository.save(patient);
        } else if (registerRequest.getRole().equals("receptionist")) {
            Receptionist receptionist = new Receptionist();
            receptionist.setFirstName(registerRequest.getFirstName());
            receptionist.setLastName(registerRequest.getLastName());
            receptionist.setGender(registerRequest.getGender());
            receptionist.setPhone(registerRequest.getPhone());
            receptionist.setEmail(registerRequest.getEmail());
            receptionist.setPassword(BCrypt.hashpw(registerRequest.getPassword(), BCrypt.gensalt()));
            receptionistRepository.save(receptionist);
        }

    }

}
