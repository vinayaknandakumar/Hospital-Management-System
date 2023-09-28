package com.Hospital.hospitalmanagementsystem.Controller;

import com.Hospital.hospitalmanagementsystem.Request.PatientRequest;
import com.Hospital.hospitalmanagementsystem.Response.PatientResponse;
import com.Hospital.hospitalmanagementsystem.Service.PatientService;
import com.Hospital.hospitalmanagementsystem.Service.RegisterService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping(value = "/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping(value = "/login")
    @ResponseBody
    @Operation(summary = "login for patient", description = "login patient by taking inputs as email and password")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Login Successful",
                    content = @Content),
            @ApiResponse(responseCode = "400",
                    description = "Login Failed, Status Code = 400",
                    content = @Content)})
    public PatientResponse patientLogin(@RequestBody @Parameter(
            description = "PatientRequest object",
            required = true,
            content = @Content(schema = @Schema(implementation = PatientRequest.class))) PatientRequest patientRequest){
        return patientService.patientLogin(patientRequest);
    }


}
