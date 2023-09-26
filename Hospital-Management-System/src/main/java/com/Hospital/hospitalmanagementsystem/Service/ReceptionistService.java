package com.Hospital.hospitalmanagementsystem.Service;

import com.Hospital.hospitalmanagementsystem.Entity.Billing;
import com.Hospital.hospitalmanagementsystem.Entity.Receptionist;
import com.Hospital.hospitalmanagementsystem.Exception.ValidationException;
import com.Hospital.hospitalmanagementsystem.Repository.BillingRepository;
import com.Hospital.hospitalmanagementsystem.Repository.ReceptionistRepository;
import com.Hospital.hospitalmanagementsystem.Request.ReceptionistRequest;
import com.Hospital.hospitalmanagementsystem.Response.ReceptionistResponse;
import jakarta.persistence.EntityNotFoundException;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceptionistService {

    @Autowired
    private ReceptionistRepository receptionistRepository;
    @Autowired
    private BillingRepository billingRepository;

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

    public Double getBillDetails(String patientPhone){

        List<Billing> billingList = billingRepository.findByPatientPhone(patientPhone);

        if (!billingList.isEmpty()) {
            for (Billing billing : billingList) {
                if (!billing.isPaymentStatus()) {
                    return billingRepository.calculateTotalAmountByPatientPhone(patientPhone);
                }
                else return 0.00;
            }
        }
        throw new EntityNotFoundException("No such bill exist");
    }

    public void clearDues(String patientPhone){
        List<Billing> billing = billingRepository.findByPatientPhone(patientPhone);
        if (billing.isEmpty()){
            throw new EntityNotFoundException("No such billing exist");
        }
        for (Billing bill : billing){
            if (!bill.isPaymentStatus()){
                bill.setPaymentStatus(true);
                billingRepository.save(bill);
            }
        }

    }
}
