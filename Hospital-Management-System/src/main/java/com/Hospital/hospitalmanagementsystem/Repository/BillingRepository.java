package com.Hospital.hospitalmanagementsystem.Repository;

import com.Hospital.hospitalmanagementsystem.Entity.Billing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillingRepository extends JpaRepository<Billing,Integer> {
    boolean existsByPrescription_PrescriptionId(int prescriptionId);

    List<Billing> findByPatientPhone(String phone);

    @Query("SELECT SUM(b.totalAmount) FROM Billing b WHERE b.patient.phone = :patientPhone")
    Double calculateTotalAmountByPatientPhone(@Param("patientPhone") String patientPhone);
}
