package com.Hospital.hospitalmanagementsystem.Controller;

import com.Hospital.hospitalmanagementsystem.Request.BillingRequest;
import com.Hospital.hospitalmanagementsystem.Service.BillingService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/bill")
public class BillingController {

    @Autowired
    private BillingService billingService;

    @PostMapping(value = "generate/bill")
    public ResponseEntity<String> generateBill(@RequestBody @Valid BillingRequest billingRequest){
        Double amount = billingService.generateBill(billingRequest);
        return ResponseEntity.ok("Bill generated. Amount to be paid: Rs "+amount);
    }
}
