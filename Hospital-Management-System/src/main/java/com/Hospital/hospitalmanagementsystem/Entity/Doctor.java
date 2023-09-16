package com.Hospital.hospitalmanagementsystem.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Doctor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int doctorId;

    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String specialization;
    private boolean doctorPresent;
    private String password;
}

