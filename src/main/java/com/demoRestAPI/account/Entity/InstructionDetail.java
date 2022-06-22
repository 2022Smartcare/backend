package com.demoRestAPI.account.Entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
@EqualsAndHashCode @Builder
@AllArgsConstructor @NoArgsConstructor
public class InstructionDetail {

    @Id
    @GeneratedValue
    @Column(name = "DETAIL_ID")
    private Long instructionDetailId;

    private String check;
}
