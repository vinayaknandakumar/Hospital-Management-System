package com.Hospital.hospitalmanagementsystem.Request;

import com.Hospital.hospitalmanagementsystem.Entity.Doctor;
import com.Hospital.hospitalmanagementsystem.Entity.Patient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentRequest {
    private Patient patient;
    private Doctor doctor;
    private String appointmentDate;
    private int appointmentSlots;
    private boolean doctorFreeStatus;
    private boolean treatmentStatus;
}
