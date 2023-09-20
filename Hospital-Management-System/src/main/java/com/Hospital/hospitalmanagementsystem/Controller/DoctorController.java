package com.Hospital.hospitalmanagementsystem.Controller;

import com.Hospital.hospitalmanagementsystem.Request.DoctorRequest;
import com.Hospital.hospitalmanagementsystem.Request.PatientRequest;
import com.Hospital.hospitalmanagementsystem.Response.DoctorResponse;
import com.Hospital.hospitalmanagementsystem.Service.DoctorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping(value = "/login")
    @ResponseBody
    @Operation(summary = "login for doctor", description = "login doctor by taking inputs as email and password")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Login Successful",
                    content = @Content),
            @ApiResponse(responseCode = "400",
                    description = "Login Failed, Status Code = 400",
                    content = @Content)})
    public DoctorResponse loginDoctor(@RequestBody @Parameter(
            description = "DoctorRequest object",
            required = true,
            content = @Content(schema = @Schema(implementation = DoctorRequest.class))) DoctorRequest doctorRequest)
    {
        return doctorService.loginDoctor(doctorRequest);
    }
}
