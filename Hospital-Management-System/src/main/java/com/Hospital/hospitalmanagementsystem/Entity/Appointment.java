package com.Hospital.hospitalmanagementsystem.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "Appointment")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int appointmentId;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    private Date appointmentDate;
    private LocalTime appointmentTime;
    private boolean doctorFreeStatus;
    private boolean treatmentStatus;
}

