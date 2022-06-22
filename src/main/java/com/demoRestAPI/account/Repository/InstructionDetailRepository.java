package com.demoRestAPI.account.Repository;

import com.demoRestAPI.account.Entity.Instruction;
import com.demoRestAPI.account.Entity.InstructionDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InstructionDetailRepository extends JpaRepository<InstructionDetail, Long> {

    List<InstructionDetail> findInstructionDetailByInstructionId(Long instructionId);

}
