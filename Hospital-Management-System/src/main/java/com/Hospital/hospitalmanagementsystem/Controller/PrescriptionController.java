package com.Hospital.hospitalmanagementsystem.Controller;

import com.Hospital.hospitalmanagementsystem.Request.PrescriptionRequest;
import com.Hospital.hospitalmanagementsystem.Service.PrescriptionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/prescription")
public class PrescriptionController {

    @Autowired
    private PrescriptionService prescriptionService;

    @PostMapping(value = "/add/prescription")
    public ResponseEntity<String> addPrescription(@RequestBody @Valid PrescriptionRequest prescriptionRequest){
        prescriptionService.addPrescription(prescriptionRequest);
        return ResponseEntity.ok("Prescription added");
    }
}
