package com.demoRestAPI.account;

import com.demoRestAPI.account.DTO.InstructionDTO;
import com.demoRestAPI.account.DTO.PatientDTO;
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
    public List<InstructionDTO> showOrders(@RequestParam("patientId") Long patientId){
        return nurseService.getInstructions(patientId);
    }
}
