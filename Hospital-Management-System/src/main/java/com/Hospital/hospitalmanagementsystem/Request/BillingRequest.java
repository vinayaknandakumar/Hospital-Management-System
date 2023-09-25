package com.Hospital.hospitalmanagementsystem.Request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BillingRequest {

    @NotNull(message = "Doctor email cannot be null")
    private String doctorEmail;
    @NotNull(message = "Patient email cannot be null")
    private String patientEmail;
    @NotNull(message = "Receptionist email cannot be null")
    private String receptionistEmail;
    @NotNull(message = "Prescription id cannot be null")
    private int prescriptionId;
    private Double doctorAmount;
}
