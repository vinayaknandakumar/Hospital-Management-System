package com.Hospital.hospitalmanagementsystem.Controller;

import com.Hospital.hospitalmanagementsystem.Request.DoctorRequest;
import com.Hospital.hospitalmanagementsystem.Request.DueDetails;
import com.Hospital.hospitalmanagementsystem.Request.ReceptionistRequest;
import com.Hospital.hospitalmanagementsystem.Response.ReceptionistResponse;
import com.Hospital.hospitalmanagementsystem.Service.ReceptionistService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/receptionist")
public class ReceptionistController {

    @Autowired
    private ReceptionistService receptionistService;

    @PostMapping(value = "/login")
    @ResponseBody
    @Operation(summary = "login for receptionist", description = "login receptionist by taking inputs as email and password")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Login Successful",
                    content = @Content),
            @ApiResponse(responseCode = "400",
                    description = "Login Failed, Status Code = 400",
                    content = @Content)})
    public ReceptionistResponse loginReceptionist(@RequestBody @Parameter(
            description = "ReceptionistRequest object",
            required = true,
            content = @Content(schema = @Schema(implementation = ReceptionistRequest.class))) ReceptionistRequest receptionistRequest){
        return receptionistService.loginReceptionist(receptionistRequest);

    }

    @GetMapping(value = "get/due")
    public ResponseEntity<String> getBillDetails(@RequestParam("patientPhone") String patientPhone){
       Double amount = receptionistService.getBillDetails(patientPhone.replaceAll("[\\n\\r]", ""));
       return ResponseEntity.ok("Amount Due: Rs "+amount);
    }

    @PutMapping(value = "clear/due")
    public ResponseEntity<String> clearDues(@RequestParam("patientPhone") String patientPhone){
        receptionistService.clearDues(patientPhone.replaceAll("[\\n\\r]", ""));
        return ResponseEntity.ok("Dues cleared");
    }


}
