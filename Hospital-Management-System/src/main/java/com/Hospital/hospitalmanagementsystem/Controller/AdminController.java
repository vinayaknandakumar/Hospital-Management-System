package com.Hospital.hospitalmanagementsystem.Controller;


import com.Hospital.hospitalmanagementsystem.Request.AdminRequest;
import com.Hospital.hospitalmanagementsystem.Response.AdminResponse;
import com.Hospital.hospitalmanagementsystem.Response.DoctorResponse;
import com.Hospital.hospitalmanagementsystem.Response.PatientResponse;
import com.Hospital.hospitalmanagementsystem.Response.ReceptionistResponse;
import com.Hospital.hospitalmanagementsystem.Service.AdminService;
import com.Hospital.hospitalmanagementsystem.Service.PatientService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {

@Autowired
private AdminService adminService;

    @PostMapping(value = "/login")
    @ResponseBody
    @Operation(summary = "login for admin", description = "login admin by taking inputs as email and password")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Login Successful",
                    content = @Content),
            @ApiResponse(responseCode = "400",
                    description = "Login Failed, Status Code = 400",
                    content = @Content)})
    public AdminResponse adminLogin(@RequestBody @Parameter(
            description = "AdminRequest object",
            required = true,
            content = @Content(schema = @Schema(implementation = AdminRequest.class)))
                                        AdminRequest adminRequest) throws ValidationException {
        return adminService.adminLogin(adminRequest);
    }

   @PutMapping(value = "/delete/doctor")
   @Operation(summary = "remove doctor ", description = "admin removing doctor by giving the doctor email : setting doctorPresent to false")
   @ApiResponses(value = {
           @ApiResponse(responseCode = "200",
                   description = "Removal Successful",
                   content = @Content),
           @ApiResponse(responseCode = "400",
                   description = "Removal Failed, Status Code = 400",
                   content = @Content)})
   public ResponseEntity<String> removeDoctor(@RequestParam @Parameter(
           description = "Doctor email", required = true,
           schema = @Schema(type = "String")) String email){
        email = email.replaceAll("[\\n\\r]", "");
        //System.out.println("1"+email+"1");
        adminService.removeDoctor(email);
        return ResponseEntity.ok("Doctor successfully removed");
    }

    @GetMapping(value = "/get/alldoctors")
    @Operation(summary = "get all doctors", description = "admin can get the list of all doctors")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Retrieval Successful",
                    content = @Content),
            @ApiResponse(responseCode = "400",
                    description = "Retrieval Failed, Status Code = 400",
                    content = @Content)})
    @ResponseBody
    public List<DoctorResponse> getAllDoctors(){
        return adminService.getAllDoctors();
    }

    @GetMapping(value = "get/allpatients")
    @Operation(summary = "get all patients", description = "admin can get the list of all patients")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Retrieval Successful",
                    content = @Content),
            @ApiResponse(responseCode = "400",
                    description = "Retrieval Failed, Status Code = 400",
                    content = @Content)})
    @ResponseBody
    public List<PatientResponse> getAllPatients(){
        return adminService.getAllPatients();
    }

    @GetMapping(value = "get/allreceptionists")
    @Operation(summary = "get all receptionists", description = "admin can get the list of all receptionists")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Retrieval Successful",
                    content = @Content),
            @ApiResponse(responseCode = "400",
                    description = "Retrieval Failed, Status Code = 400",
                    content = @Content)})
    @ResponseBody
    public List<ReceptionistResponse> getAllReceptionists(){
        return adminService.getAllReceptionists();
    }


}
/*
@Parameter(
           description = "Doctor email", required = true,
           schema = @Schema(type = "String"))
 */