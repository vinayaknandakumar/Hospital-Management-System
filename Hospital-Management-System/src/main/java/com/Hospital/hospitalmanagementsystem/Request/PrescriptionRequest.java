package com.Hospital.hospitalmanagementsystem.Request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PrescriptionRequest {

    @NotNull(message = "Doctor name can't be null")
    private String doctorEmail;

    @NotNull(message = "Patient name can't be null")
    private String patientEmail;

    private List<String> medicines;
    private String prescriptionData;
}
