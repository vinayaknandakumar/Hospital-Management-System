package com.Hospital.hospitalmanagementsystem.Repository;

import com.Hospital.hospitalmanagementsystem.Entity.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescriptionRepository extends JpaRepository<Prescription,Integer> {
}
