package com.Hospital.hospitalmanagementsystem.Request;

import com.Hospital.hospitalmanagementsystem.Entity.Doctor;
import com.Hospital.hospitalmanagementsystem.Entity.Patient;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentRequest {

    @NotBlank(message = "Email is a required field")
    @Email(message = "Invalid email format")
    private String patientEmail;

    @NotBlank(message = "Email is a required field")
    @Email(message = "Invalid email format")
    private String doctorEmail;
    private String appointmentDate;
    private int appointmentSlots;
    private boolean doctorFreeStatus;
    private boolean treatmentStatus;
}
