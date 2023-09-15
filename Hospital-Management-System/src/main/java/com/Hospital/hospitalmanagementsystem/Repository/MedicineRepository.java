package com.Hospital.hospitalmanagementsystem.Repository;

import com.Hospital.hospitalmanagementsystem.Entity.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine,Integer> {
}
