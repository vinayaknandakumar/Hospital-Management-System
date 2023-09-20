package com.Hospital.hospitalmanagementsystem.Controller;


import com.Hospital.hospitalmanagementsystem.Entity.Admin;
import com.Hospital.hospitalmanagementsystem.Request.AdminRequest;
import com.Hospital.hospitalmanagementsystem.Response.AdminResponse;
import com.Hospital.hospitalmanagementsystem.Service.AdminService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

   @PutMapping(value = "/delete-doctor")
   @ResponseBody
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


}
/*
@Parameter(
           description = "Doctor email", required = true,
           schema = @Schema(type = "String"))
 */