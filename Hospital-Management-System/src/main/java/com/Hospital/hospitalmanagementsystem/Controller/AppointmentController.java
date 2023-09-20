package com.Hospital.hospitalmanagementsystem.Controller;

import com.Hospital.hospitalmanagementsystem.Request.AdminRequest;
import com.Hospital.hospitalmanagementsystem.Request.AppointmentRequest;
import com.Hospital.hospitalmanagementsystem.Service.AppointmentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping(value = "/book")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @PostMapping(value = "/appointment")
    @Operation(summary = "booking appointments", description = "patient can book an appointment with a doctor")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Login Successful",content = @Content),
            @ApiResponse(responseCode = "400", description = "Login Failed, Status Code = 400", content = @Content)})
    public ResponseEntity<String> addAppointment(@RequestBody @Parameter(
            description = "AppointmentRequest object",
            required = true,
            content = @Content(schema = @Schema(implementation = AppointmentRequest.class))) AppointmentRequest appointmentRequest) throws ParseException {
        appointmentService.addAppointment(appointmentRequest);
        return ResponseEntity.ok("Appointment Scheduled");
    }
}
