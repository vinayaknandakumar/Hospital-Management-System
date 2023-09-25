package com.Hospital.hospitalmanagementsystem.Service;

import com.Hospital.hospitalmanagementsystem.Entity.Medicine;
import com.Hospital.hospitalmanagementsystem.Repository.MedicineRepository;
import com.Hospital.hospitalmanagementsystem.Request.MedicineRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicineService {

    @Autowired
    private MedicineRepository medicineRepository;

    public void addMedicine(MedicineRequest medicineRequest){
        Medicine medicine = new Medicine();
        medicine.setMedicineName(medicineRequest.getMedicineName());
        medicine.setPrice(medicineRequest.getPrice());
        medicineRepository.save(medicine);
    }
}
