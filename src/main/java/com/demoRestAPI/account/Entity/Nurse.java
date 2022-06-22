package com.demoRestAPI.account.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@EqualsAndHashCode(of = "nurseId")
@Builder @AllArgsConstructor @NoArgsConstructor
public class Nurse {

    @Id @GeneratedValue
    @Column(name = "NURSE_ID")
    private Long nurseId;

    private String name;

    private boolean gender;

    private String phone;

    @OneToMany
    @JoinTable(name = "MATCHED",
            joinColumns = @JoinColumn(name="NURSE_ID"),
            inverseJoinColumns = @JoinColumn(name="PATIENT_ID"))
    private List<Patient> patients = new ArrayList<>();

    @OneToMany
    @JoinTable(name = "RESERVATION",
            joinColumns = @JoinColumn(name="NURSE_ID"),
            inverseJoinColumns = @JoinColumn(name="PATIENT_ID"))
    private List<Patient> reservations = new ArrayList<>();
}
