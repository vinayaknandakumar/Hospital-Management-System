package com.Hospital.hospitalmanagementsystem.Request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DueDetails {
    private String receptionistEmail;
    private String patientPhone;
}
