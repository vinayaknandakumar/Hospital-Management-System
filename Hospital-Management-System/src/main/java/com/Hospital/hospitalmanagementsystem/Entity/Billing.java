package com.Hospital.hospitalmanagementsystem.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "Billing")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Billing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int billingId;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "receptionist_id")
    private Receptionist receptionist;

    private Date billingDate;
    private double totalAmount;
}

