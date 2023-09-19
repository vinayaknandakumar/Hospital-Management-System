package com.Hospital.hospitalmanagementsystem.Controller;

import com.Hospital.hospitalmanagementsystem.Exception.ValidationException;
import com.Hospital.hospitalmanagementsystem.Request.RegisterRequest;
import com.Hospital.hospitalmanagementsystem.Service.RegisterService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;

@RestController
@Validated
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    /**
     * Controller for all registrations of doctor, patient, receptionist, and admin
     *
     * @param registerRequest The registration request
     * @return HTTP response indicating success or failure
     */
    @PostMapping("/register")
    @Operation(
            summary = "Register a new staff member",
            description = "Registers a new staff member (doctor, patient, receptionist, or admin)."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Registration Successful", content = @Content),
            @ApiResponse(responseCode = "400", description = "Validation or Bad Request", content = @Content),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content)
    })
    public ResponseEntity<String> register(@RequestBody @Valid @Parameter(description = "RegisterRequest object", required = true,
            content = @Content(schema = @Schema(implementation = RegisterRequest.class)))
                                           RegisterRequest registerRequest
    ) {
        registerService.registerStaff(registerRequest);
        return ResponseEntity.ok("Registration Successful");
    }
}
