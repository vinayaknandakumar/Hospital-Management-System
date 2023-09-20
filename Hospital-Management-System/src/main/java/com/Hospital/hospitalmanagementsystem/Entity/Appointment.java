package com.Hospital.hospitalmanagementsystem.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.sql.Date;


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
    @JoinColumn(name = "patient_email")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "doctor_email")
    private Doctor doctor;

    private Date appointmentDate;
    private int appointmentSlots;
    private boolean doctorFreeStatus;
    private boolean treatmentStatus;
}

