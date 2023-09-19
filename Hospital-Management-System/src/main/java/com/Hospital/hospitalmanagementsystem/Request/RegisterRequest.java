package com.Hospital.hospitalmanagementsystem.Request;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    @NotBlank(message = "First name is required")
    @Size(min = 1, max = 25, message = "First name must be between 1 and 25 characters")
    private String firstName;

    @NotBlank(message = "Last name is required")
    @Size(min = 1, max = 25, message = "Last name must be between 1 and 25 characters")
    private String lastName;

    @NotBlank(message = "Email is a required field")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Phone number is a required field")
    @Pattern(regexp = "^[0-9]{10}$", message = "Invalid phone number format. Must be 10 digits.")
    private String phone;

    @NotBlank(message = "Password is  a required field")
    @Size(min = 8, message = "Password must contain at least 8 characters")
    private String password;


    private String gender;

    private String specialization;

    private boolean doctorPresent;

    @Pattern(regexp = "^[0-9]+$", message = "Age must be a non-negative integer")
    private String age;

    @Size(max = 255, message = "Address must be less than or equal to 255 characters")
    private String address;

    @NotBlank(message = "Role is required")
    @Pattern(regexp = "^(doctor|admin|receptionist|patient)$", message = "Invalid role. The only allowed roles are 'doctor', 'admin', 'receptionist', 'patient'.")
    private String role;
}

