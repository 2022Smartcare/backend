package com.demoRestAPI.account.Repository;

import com.demoRestAPI.account.Entity.Instruction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InstructionRepository extends JpaRepository<Instruction, Long> {

    List<Instruction> findInstructionByInstructionId(Long instructionId);

}
