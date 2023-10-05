package com.Hospital.hospitalmanagementsystem.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "Medicine")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int medicineId;
    @Column(unique = true)
    private String medicineName;
    private Double price;

    public Medicine(String medicine1, double v) {
    }
}

