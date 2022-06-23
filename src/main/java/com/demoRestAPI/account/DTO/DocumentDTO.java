package com.demoRestAPI.account.DTO;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class DocumentDTO {
    Long DocumentId;
    LocalDateTime date;
    Integer diseaseCare;
    Integer nutritionCare;
    Integer excretionCare;
    Integer bodyCare;
    Integer recognitionCare;
    Integer counseling;
    String note;
}
