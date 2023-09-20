package com.Hospital.hospitalmanagementsystem.Service;

import com.Hospital.hospitalmanagementsystem.Entity.Receptionist;
import com.Hospital.hospitalmanagementsystem.Exception.ValidationException;
import com.Hospital.hospitalmanagementsystem.Repository.ReceptionistRepository;
import com.Hospital.hospitalmanagementsystem.Request.ReceptionistRequest;
import com.Hospital.hospitalmanagementsystem.Response.ReceptionistResponse;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceptionistService {

    @Autowired
    private ReceptionistRepository receptionistRepository;

    public ReceptionistResponse loginReceptionist(ReceptionistRequest receptionistRequest){
        Receptionist receptionist;
        ReceptionistResponse receptionistResponse = new ReceptionistResponse();
        receptionist = receptionistRepository.findByEmail(receptionistRequest.getEmail());
        if (receptionist != null){
            if (BCrypt.checkpw(receptionistRequest.getPassword(),receptionist.getPassword())){
                receptionistResponse.setEmail(receptionist.getEmail());
                receptionistResponse.setFirstName(receptionist.getFirstName());
                receptionistResponse.setLastName(receptionist.getLastName());
                return  receptionistResponse;
            } throw new ValidationException("Wrong password");
        } throw new ValidationException("Receptionist not registered");
    }
}
