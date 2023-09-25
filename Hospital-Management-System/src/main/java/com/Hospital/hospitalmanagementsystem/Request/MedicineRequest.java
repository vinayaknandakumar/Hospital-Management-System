package com.Hospital.hospitalmanagementsystem.Request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MedicineRequest {
    @NotNull(message = "Medicine name is a required field")
    private String medicineName;
    @NotNull(message = "Medicine price is a required field")
    private Double price;
}
