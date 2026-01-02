package com.software.patientservice.service;

import com.software.patientservice.dto.PatientRequestDTO;
import com.software.patientservice.dto.PatientResponseDTO;
import com.software.patientservice.entity.Patient;
import com.software.patientservice.repository.PatientRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<PatientResponseDTO> getAllPatients() {
        List<Patient> patients = patientRepository.findAll();
        List<PatientResponseDTO> patientResponseDTOS = new ArrayList<>();
        for (Patient patient : patients) {
            PatientResponseDTO patientResponseDTO = new PatientResponseDTO();
            BeanUtils.copyProperties(patient, patientResponseDTO);
            patientResponseDTOS.add(patientResponseDTO);
        }
        return patientResponseDTOS;
    }

    public PatientResponseDTO createPatient(PatientRequestDTO patientRequestDTO) {
        Patient patient = new Patient();
        BeanUtils.copyProperties(patientRequestDTO, patient);

        patient = patientRepository.save(patient);
        PatientResponseDTO patientResponseDTO = new PatientResponseDTO();
        BeanUtils.copyProperties(patient, patientResponseDTO);
        return patientResponseDTO;
    }

    public PatientResponseDTO getPatientById(String id) {
        Patient patient = patientRepository.findById(UUID.fromString(id))
                .orElseThrow(() -> new RuntimeException("Patient not found with id: " + id));
        PatientResponseDTO patientResponseDTO = new PatientResponseDTO();
        BeanUtils.copyProperties(patient, patientResponseDTO);
        return patientResponseDTO;
    }
}
