package com.Hospital.hospitalmanagementsystem.Service;

import com.Hospital.hospitalmanagementsystem.Entity.Patient;
import com.Hospital.hospitalmanagementsystem.Exception.ValidationException;
import com.Hospital.hospitalmanagementsystem.Repository.PatientRepository;
import com.Hospital.hospitalmanagementsystem.Request.PatientRequest;
import com.Hospital.hospitalmanagementsystem.Response.PatientResponse;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public PatientResponse patientLogin(PatientRequest patientRequest) {
        Patient patient;
        PatientResponse patientResponse = new PatientResponse();
        patient = patientRepository.findByEmail(patientRequest.getEmail());
        if (patient != null) {
            if (BCrypt.checkpw(patientRequest.getPassword(), patient.getPassword())) {
                patientResponse.setEmail(patient.getEmail());
                patientResponse.setFirstName(patient.getFirstName());
                patientResponse.setLastName(patient.getLastName());
                return patientResponse;
            }
            throw new ValidationException("Wrong password");
        }
        throw new ValidationException("Patient not registered");
    }
}
