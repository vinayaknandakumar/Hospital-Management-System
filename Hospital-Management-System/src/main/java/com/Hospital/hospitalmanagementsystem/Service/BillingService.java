package com.Hospital.hospitalmanagementsystem.Service;

import com.Hospital.hospitalmanagementsystem.Entity.*;
import com.Hospital.hospitalmanagementsystem.Exception.OneToOneException;
import com.Hospital.hospitalmanagementsystem.Exception.ValidationException;
import com.Hospital.hospitalmanagementsystem.Repository.*;
import com.Hospital.hospitalmanagementsystem.Request.BillingRequest;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BillingService {

    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private PrescriptionRepository prescriptionRepository;
    @Autowired
    private ReceptionistRepository receptionistRepository;
    @Autowired
    private BillingRepository billingRepository;

    public void generateBill(BillingRequest billingRequest) {

        Doctor doctor = doctorRepository.findByEmail(billingRequest.getDoctorEmail());
        Patient patient = patientRepository.findByEmail(billingRequest.getPatientEmail());
        Receptionist receptionist = receptionistRepository.findByEmail(billingRequest.getReceptionistEmail());
        Prescription prescription = prescriptionRepository.findById(billingRequest.getPrescriptionId());

        if (billingRepository.existsByPrescription_PrescriptionId(billingRequest.getPrescriptionId())) {
            throw new OneToOneException("A billing record already exists for the provided prescriptionId.");
        }



        if (doctor != null && patient != null && receptionist != null && prescription != null && doctor.isDoctorPresent()) {
            // Calculate medicineAmount based on prescription medicines
            Double medicineAmount = prescription.getMedicines().stream()
                    .mapToDouble(Medicine::getPrice)
                    .sum();

            Double totalAmount = medicineAmount + billingRequest.getDoctorAmount();

//            () -> new Billing()
//                    .setDoctor(doctor)
//                    .se

            Billing billing = new Billing();
            billing.setDoctor(doctor);
            billing.setPatient(patient);
            billing.setReceptionist(receptionist);
            billing.setPrescription(prescription);
            billing.setMedicineAmount(medicineAmount);
            billing.setDoctorAmount(billingRequest.getDoctorAmount());
            billing.setTotalAmount(totalAmount);
            billing.setBillingDate(prescription.getPrescriptionDate());
            billingRepository.save(billing);

        } else {
            throw new EntityNotFoundException("Unable to create billing. Invalid email or prescriptionId.");
        }
    }
}
