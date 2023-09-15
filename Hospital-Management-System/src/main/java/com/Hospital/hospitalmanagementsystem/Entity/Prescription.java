package com.Hospital.hospitalmanagementsystem.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Prescription")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int prescriptionId;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToMany
    @JoinTable(name = "prescription_medicines",
            joinColumns = @JoinColumn(name = "prescription_id"),
            inverseJoinColumns = @JoinColumn(name = "medicine_id"))
    private List<Medicine> medicines;

    private Date prescriptionDate;
    private String prescriptionData;
}

