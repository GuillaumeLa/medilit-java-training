package com.glabaden.medlit.service;

import java.util.Optional;

import com.glabaden.medlit.entity.Patient;
import com.glabaden.medlit.exception.AlreadyUsedIppException;
import com.glabaden.medlit.repository.PatientRepository;


public class PatientService {
	private final PatientRepository patientRepository;
	
    public PatientService(PatientRepository repository) {
        this.patientRepository = repository;
    }
    public void registerPatient(Patient patient) throws AlreadyUsedIppException {
        if (patientRepository.existsByIpp(patient.getIpp())) {
            throw new AlreadyUsedIppException();
        }
        patientRepository.save(patient);
    }
    public Optional<Patient> getPatientByIpp(String ippString){
    	return patientRepository.findPatientByIpp(ippString);
    	
    }
    
}
