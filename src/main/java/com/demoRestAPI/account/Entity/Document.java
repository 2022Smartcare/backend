package com.demoRestAPI.account.Entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
@EqualsAndHashCode(of = "recordId")
@Builder @AllArgsConstructor @NoArgsConstructor
public class Document {

    @Id
    @GeneratedValue
    @Column(name = "DOCUMENT_Id")
    private Long documentId;

    private Long patientId;

    private LocalDateTime date;

    private Integer diseaseCare;

    private Integer nutritionCare;

    private Integer excretionCare;

    private Integer bodyCare;

    private Integer recognitionCare;

    private Integer counseling;

    private String note;
}
