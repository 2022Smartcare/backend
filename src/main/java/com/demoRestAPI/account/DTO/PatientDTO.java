package com.demoRestAPI.account.DTO;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data @Builder
@EqualsAndHashCode(callSuper = false)
public class PatientDTO {
    Long patientId;
    String name;
    String birth;
    Boolean gender;
    String phone;
    boolean emergence;
    String issuanceId;
    String recognitionId;
    int grade;
    String note;
}
