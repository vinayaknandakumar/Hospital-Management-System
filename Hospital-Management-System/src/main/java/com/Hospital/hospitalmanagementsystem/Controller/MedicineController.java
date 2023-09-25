package com.Hospital.hospitalmanagementsystem.Controller;

import com.Hospital.hospitalmanagementsystem.Request.MedicineRequest;
import com.Hospital.hospitalmanagementsystem.Service.MedicineService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/medicine")
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @PostMapping(value = "/add/medicine")
    public ResponseEntity<String> addMedicine(@RequestBody @Valid MedicineRequest medicineRequest){
        medicineService.addMedicine(medicineRequest);
        return ResponseEntity.ok("Medicine added");
    }
}
