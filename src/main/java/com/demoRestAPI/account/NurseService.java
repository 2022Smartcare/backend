package com.demoRestAPI.account;

import com.demoRestAPI.account.DTO.*;
import com.demoRestAPI.account.Entity.*;
import com.demoRestAPI.account.Repository.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class NurseService {

    private final NurseRepository nurseRepository;
    private final PatientRepository patientRepository;
    private final InstructionRepository instructionRepository;
    private final InstructionDetailRepository instructionDetailRepository;
    private final DocumentRepository documentRepository;

    @Transactional
    public List<PatientDTO> getPatients(Long nurseId){
        Nurse nurse = nurseRepository.findNurseByNurseId(nurseId);

        List<PatientDTO> patientDTOList = new ArrayList<>();
        for(Patient patient : nurse.getPatients()){
            PatientDTO eachPatient = PatientDTO.builder()
                    .patientId(patient.getPatientId())
                    .name(patient.getName())
                    .birth(patient.getBirth())
                    .gender(patient.isGender())
                    .phone(patient.getPhone())
                    .recognitionId(patient.getRecognitionId())
                    .note(patient.getNote())
                    .issuanceId(patient.getIssuanceId())
                    .emergence(patient.isEmergence())
                    .grade(patient.getGrade())
                    .build();

            patientDTOList.add(eachPatient);
        }

        return patientDTOList;
    }

    @Transactional
    public List<PatientDTO> getReservations(Long nurseId){
        Nurse nurse = nurseRepository.findNurseByNurseId(nurseId);

        List<PatientDTO> patientDTOList = new ArrayList<>();
        for(Patient patient : nurse.getReservations()){
            PatientDTO eachPatient = PatientDTO.builder()
                    .patientId(patient.getPatientId())
                    .name(patient.getName())
                    .birth(patient.getBirth())
                    .gender(patient.isGender())
                    .phone(patient.getPhone())
                    .grade(patient.getGrade())
                    .emergence(patient.isEmergence())
                    .issuanceId(patient.getIssuanceId())
                    .note(patient.getNote())
                    .recognitionId(patient.getRecognitionId())
                    .build();

            patientDTOList.add(eachPatient);
        }

        return patientDTOList;
    }


    public List<PatientDTO> getEmergencePatients(Long nurseId){
        Nurse nurse = nurseRepository.findNurseByNurseId(nurseId);

        List<PatientDTO> emergencePatients = new ArrayList<>();
        for(Patient patient : nurse.getPatients()){
            if(patient.isEmergence()){
                PatientDTO eachPatient = PatientDTO.builder()
                        .patientId(patient.getPatientId())
                        .name(patient.getName())
                        .birth(patient.getBirth())
                        .gender(patient.isGender())
                        .phone(patient.getPhone())
                        .grade(patient.getGrade())
                        .emergence(patient.isEmergence())
                        .issuanceId(patient.getIssuanceId())
                        .note(patient.getNote())
                        .recognitionId(patient.getRecognitionId())
                        .build();

                emergencePatients.add(eachPatient);
            }
        }

        return emergencePatients;
    }

    public PatientDTO getPatientInfo(Long patientId){
        Patient patient = patientRepository.findPatientByPatientId(patientId);

        PatientDTO patientDTO = PatientDTO.builder()
                .patientId(patient.getPatientId())
                .phone(patient.getPhone())
                .birth(patient.getBirth())
                .name(patient.getName())
                .emergence(patient.isEmergence())
                .gender(patient.isGender())
                .grade(patient.getGrade())
                .issuanceId(patient.getIssuanceId())
                .note(patient.getNote())
                .recognitionId(patient.getRecognitionId())
                .build();

        return patientDTO;
    }

    public List<InstructionDTO> getInstructions(Long patientId){
        Patient patient = patientRepository.findPatientByPatientId(patientId);

        List<InstructionDTO> orders = new ArrayList<>();
        for(Instruction instruction : patient.getInstructions()) {

//            List<InstructionDetailDTO> details = new ArrayList<>();
//            for(InstructionDetail instructionDetail : instruction.getInstructionDetails()){
//                InstructionDetailDTO detailDTO = InstructionDetailDTO.builder()
//                        .instructionDetailId(instructionDetail.getInstructionDetailId())
//                        .check(instructionDetail.getCheck())
//                        .build();
//
//                details.add(detailDTO);
//            }

            InstructionDTO instructionDTO = InstructionDTO.builder()
                    .instructionId(instruction.getInstructionId())
                    .date(instruction.getDate())
                    .disease(instruction.getDisease())
                    .examine(instruction.getExamine())
//                    .instructionDetails(details)
                    .injection(instruction.getInjection())
                    .medicine(instruction.getMedicine())
                    .note(instruction.getNote())
                    .prescribe(instruction.getPrescribe())
                    .request(instruction.getRequest())
                    .status(instruction.getStatus())
                    .visit(instruction.isVisit())
                    .build();

            orders.add(instructionDTO);
        }
        return orders;
    }

    public List<DocumentDTO> getDocuments(Long patientId){
        List<DocumentDTO> documents = new ArrayList<>();

        for(Document document : patientRepository.findPatientByPatientId(patientId).getDocuments()) {
            DocumentDTO documentDTO = DocumentDTO.builder()
                    .bodyCare(document.getBodyCare())
                    .DocumentId(document.getDocumentId())
                    .counseling(document.getCounseling())
                    .date(document.getDate())
                    .diseaseCare(document.getDiseaseCare())
                    .excretionCare(document.getExcretionCare())
                    .note(document.getNote())
                    .nutritionCare(document.getNutritionCare())
                    .recognitionCare(document.getRecognitionCare())
                    .build();

            documents.add(documentDTO);
        }

        return documents;
    }
}
