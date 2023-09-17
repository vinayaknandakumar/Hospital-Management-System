package com.Hospital.hospitalmanagementsystem.Controller;

import com.Hospital.hospitalmanagementsystem.Request.RegisterRequest;
import com.Hospital.hospitalmanagementsystem.Service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    /**
     * Controller for all registrations of doctor, patient, receptionist and admin
     * @param registerRequest
     * @return HttpResponse
     */
    @PostMapping(value = "/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequest registerRequest){
        try {
            registerService.registerStaff(registerRequest);
            return ResponseEntity.ok("Registration Successful");
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Registration failed: "+e.getMessage());
        }
    }


}
