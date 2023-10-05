package com.Hospital.hospitalmanagementsystem.Service;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import com.Hospital.hospitalmanagementsystem.Entity.Medicine;
import com.Hospital.hospitalmanagementsystem.Repository.MedicineRepository;
import com.Hospital.hospitalmanagementsystem.Request.MedicineRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MedicineServiceTest {

    @InjectMocks
    private MedicineService medicineService;

    @Mock
    private MedicineRepository medicineRepository;

    @BeforeEach
    public void setUp() {
    }

    @Test
    public void testAddMedicineSuccess() {
        // Create a MedicineRequest
        MedicineRequest medicineRequest = new MedicineRequest();
        medicineRequest.setMedicineName("Medicine A");
        medicineRequest.setPrice(10.0);

        // Mock the behavior of the medicineRepository.save method
        when(medicineRepository.save(any(Medicine.class))).thenAnswer(invocation -> {
            Medicine savedMedicine = invocation.getArgument(0);
            savedMedicine.setMedicineId(1); // Simulate that the medicine got saved with an ID
            return savedMedicine;
        });

        // Call the service method
        assertDoesNotThrow(() -> medicineService.addMedicine(medicineRequest));

        // Verify that save was called with the correct Medicine object
        verify(medicineRepository, times(1)).save(any(Medicine.class));
    }
}
