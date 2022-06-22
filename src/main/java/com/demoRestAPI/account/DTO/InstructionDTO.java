package com.demoRestAPI.account.DTO;

import com.demoRestAPI.account.Entity.InstructionDetail;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class InstructionDTO {
    Long instructionId;
    Long patientId;
    boolean visit;
    String disease;
    String request;
    String status;
    String prescribe;
    String examine;
    String note;
    String injection;
    String medicine;
    LocalDateTime date;
    List<InstructionDetailDTO> instructionDetails;
}
