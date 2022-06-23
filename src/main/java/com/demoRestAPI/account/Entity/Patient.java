package com.demoRestAPI.account.Entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@EqualsAndHashCode(of = "patientId")
@Builder @AllArgsConstructor @NoArgsConstructor
public class Patient {

    @Id @GeneratedValue
    @Column(name = "PATIENT_ID")
    private Long patientId;

    private String name;

    private boolean gender;

    private String phone;

    private String birth;

    private boolean emergence;

    private String issuanceId;

    private String recognitionId;

    private Integer grade;

    private String note;

    @OneToMany
    @JoinTable(name = "PATIENT_INSTRUCTION",
            joinColumns = @JoinColumn(name="PATIENT_ID"),
            inverseJoinColumns = @JoinColumn(name="INSTRUCTION_ID"))
    private List<Instruction> instructions = new ArrayList<>();

    @OneToMany
    @JoinTable(name = "PATIENT_DOCUMENT",
            joinColumns = @JoinColumn(name="PATIENT_ID"),
            inverseJoinColumns = @JoinColumn(name="DOCUMENT_ID")
    )
    private List<Document> documents = new ArrayList<>();
}
