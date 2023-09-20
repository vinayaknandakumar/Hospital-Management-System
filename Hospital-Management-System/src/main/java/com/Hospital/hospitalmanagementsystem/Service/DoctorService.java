package com.Hospital.hospitalmanagementsystem.Service;

import com.Hospital.hospitalmanagementsystem.Entity.Doctor;
import com.Hospital.hospitalmanagementsystem.Exception.ValidationException;
import com.Hospital.hospitalmanagementsystem.Repository.DoctorRepository;
import com.Hospital.hospitalmanagementsystem.Request.DoctorRequest;
import com.Hospital.hospitalmanagementsystem.Response.DoctorResponse;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public DoctorResponse loginDoctor(DoctorRequest doctorRequest){
        Doctor doctor;
        DoctorResponse doctorResponse = new DoctorResponse();
        doctor = doctorRepository.findByEmail(doctorRequest.getEmail());
        if (doctor != null){
            if (BCrypt.checkpw(doctorRequest.getPassword(),doctor.getPassword())){
                doctorResponse.setEmail(doctor.getEmail());
                doctorResponse.setFirstName(doctor.getFirstName());
                doctorResponse.setLastName(doctor.getLastName());
                return doctorResponse;
            } throw new ValidationException("Wrong password");

        } throw new ValidationException("Doctor not registered");
    }
}
