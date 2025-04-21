package com.spring.hospital.management.repository;

import com.spring.hospital.management.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    // You can add custom methods here later if needed (e.g., findByEmail)
}
