package com.Hospital.hospitalmanagementsystem.Request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String password;
    private String gender;
    private String specialization;
    private boolean doctorPresent;
    private String age;
    private String address;
    private String role;
}
