package com.Hospital.hospitalmanagementsystem.Repository;

import com.Hospital.hospitalmanagementsystem.Entity.Receptionist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceptionistRepository extends JpaRepository<Receptionist,Integer> {
}
