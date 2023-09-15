package com.Hospital.hospitalmanagementsystem.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "Receptionist")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Receptionist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int receptionistId;

    private String firstName;
    private String lastName;
    private String gender;
    private String phone;
}
