package com.Hospital.hospitalmanagementsystem.Repository;

import com.Hospital.hospitalmanagementsystem.Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer>{
    Admin findByEmail(String email);

    Admin findByPassword(String password);
}
