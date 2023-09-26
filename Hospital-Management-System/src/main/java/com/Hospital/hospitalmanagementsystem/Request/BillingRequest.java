package com.Hospital.hospitalmanagementsystem.Request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
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
    @Min(value = 0, message = "Amount cannot be negative")
    private Double doctorAmount;
}
