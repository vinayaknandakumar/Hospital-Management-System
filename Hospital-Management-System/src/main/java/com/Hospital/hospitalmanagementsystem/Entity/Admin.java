package com.Hospital.hospitalmanagementsystem.Entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "Admin")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int adminId;

    private String firstName;
    private String lastName;
    private String email;

    //@Column(name = "password_hashed")
    private String password;
}

