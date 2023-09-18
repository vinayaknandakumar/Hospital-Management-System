package com.Hospital.hospitalmanagementsystem.Service;

import com.Hospital.hospitalmanagementsystem.Controller.RegisterController;
import com.Hospital.hospitalmanagementsystem.Entity.Admin;
import com.Hospital.hospitalmanagementsystem.Repository.AdminRepository;
import com.Hospital.hospitalmanagementsystem.Request.AdminRequest;
import com.Hospital.hospitalmanagementsystem.Request.RegisterRequest;
import com.Hospital.hospitalmanagementsystem.Response.AdminResponse;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

   @Autowired
   private AdminRepository adminRepository;

   public AdminResponse adminLogin(AdminRequest adminRequest){
       Admin admin;
       AdminResponse adminResponse = new AdminResponse();
       admin= adminRepository.findByEmail(adminRequest.getEmail());
       if(admin!=null){
           if(BCrypt.checkpw(adminRequest.getPassword(),admin.getPassword())){
               adminResponse.setFirstName(admin.getFirstName());
               adminResponse.setLastName(admin.getLastName());
               adminResponse.setEmail(admin.getEmail());
           }return adminResponse;
       }return null;
   }



}
