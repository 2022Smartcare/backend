package com.demoRestAPI.account.Repository;

import com.demoRestAPI.account.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    Patient findPatientByPatientId(Long patientId);

}
