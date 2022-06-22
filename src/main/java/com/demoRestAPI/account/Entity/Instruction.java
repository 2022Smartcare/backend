package com.demoRestAPI.account.Entity;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@EqualsAndHashCode
@Builder @AllArgsConstructor @NoArgsConstructor
public class Instruction {

    @Id
    @GeneratedValue
    @Column(name = "INSTRUCTION_ID")
    private Long instructionId;

    private Long patientId;

    private boolean visit;

    private String disease;

    private String request;

    private String status;

    private String prescribe;

    private String examine;

    private String note;

    private String injection;

    private String medicine;

    private LocalDateTime date;

    @OneToMany
    @JoinTable(name = "DETAIL",
            joinColumns = @JoinColumn(name="INSTRUCTION_ID"),
            inverseJoinColumns = @JoinColumn(name="DETAIL_ID"))
    private List<InstructionDetail> instructionDetails = new ArrayList<>();
}
