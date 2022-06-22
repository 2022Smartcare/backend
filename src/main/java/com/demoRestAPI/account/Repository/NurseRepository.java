package com.demoRestAPI.account.Repository;

import com.demoRestAPI.account.Entity.Nurse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NurseRepository extends JpaRepository<Nurse, Long> {

    Nurse findNurseByNurseId(Long nurseId);

}
