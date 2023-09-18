package com.Hospital.hospitalmanagementsystem.Controller;


import com.Hospital.hospitalmanagementsystem.Entity.Admin;
import com.Hospital.hospitalmanagementsystem.Request.AdminRequest;
import com.Hospital.hospitalmanagementsystem.Request.RegisterRequest;
import com.Hospital.hospitalmanagementsystem.Response.AdminResponse;
import com.Hospital.hospitalmanagementsystem.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {

@Autowired
private AdminService adminService;

@GetMapping(value = "/login")
public AdminResponse adminLogin(@RequestBody AdminRequest adminRequest) {
    return adminService.adminLogin(adminRequest);
}


}
