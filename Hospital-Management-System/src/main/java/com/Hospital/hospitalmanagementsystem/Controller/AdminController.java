package com.Hospital.hospitalmanagementsystem.Controller;


import com.Hospital.hospitalmanagementsystem.Entity.Admin;
import com.Hospital.hospitalmanagementsystem.Request.RegisterRequest;
import com.Hospital.hospitalmanagementsystem.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/admin")
public class AdminController {

@Autowired
private AdminService adminService;

//public void register(@RequestBody RegisterRequest registerRequest){
//    adminService.registerStaff(registerRequest);
//}

}
