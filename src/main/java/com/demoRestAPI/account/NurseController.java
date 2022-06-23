package com.demoRestAPI.account;

import com.demoRestAPI.account.DTO.DocumentDTO;
import com.demoRestAPI.account.DTO.InstructionDTO;
import com.demoRestAPI.account.DTO.PatientDTO;
import com.demoRestAPI.account.Entity.Document;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class NurseController {

    private final NurseService nurseService;

    @GetMapping( "/matched")
    @ResponseBody
    public List<PatientDTO> showPatientList(@RequestParam("nurseId") Long nurseId){
        return nurseService.getPatients(nurseId);
    }

    @GetMapping( "/reserved")
    @ResponseBody
    public List<PatientDTO> showReservationList(@RequestParam("nurseId") Long nurseId){
        return nurseService.getReservations(nurseId);
    }

    @GetMapping("/emergence")
    @ResponseBody
    public List<PatientDTO> showEmergencePatientList(@RequestParam("nurseId") Long nurseId){
        return nurseService.getEmergencePatients(nurseId);
    }

    @GetMapping("/order")
    @ResponseBody
    public List<InstructionDTO> showInstructions(@RequestParam("patientId") Long patientId){
        return nurseService.getInstructions(patientId);
    }

    @GetMapping("/document")
    @ResponseBody
    public List<DocumentDTO> showDocuments(@RequestParam("patientId") Long patientId){
        return nurseService.getDocuments(patientId);
    }
}
