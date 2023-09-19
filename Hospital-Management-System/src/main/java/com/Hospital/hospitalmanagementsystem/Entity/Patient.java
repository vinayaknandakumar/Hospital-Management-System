package com.Hospital.hospitalmanagementsystem.Entity;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "Patient")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int patientId;

    private String firstName;
    private String lastName;
    private String gender;

    @Column(unique = true)
    private String phone;
    @Column(unique = true)
    private String email;
    private String age;
    private String address;
    private String password;
}

