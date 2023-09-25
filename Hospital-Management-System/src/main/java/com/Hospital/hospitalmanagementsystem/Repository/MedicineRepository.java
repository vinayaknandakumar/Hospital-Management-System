package com.Hospital.hospitalmanagementsystem.Repository;

import com.Hospital.hospitalmanagementsystem.Entity.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine,Integer> {

    @Query("SELECT m FROM Medicine m WHERE m.medicineName IN :medicineNames")
    List<Medicine> findAllByNameIn(@Param("medicineNames") List<String> medicineNames);
}
