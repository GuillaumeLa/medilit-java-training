package com.glabaden.medlit.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.glabaden.medlit.entity.Patient;
import com.glabaden.medlit.exception.AlreadyUsedIppException;

public class PatientRepository {
	private final Map<String, Patient> patientsList = new HashMap<String, Patient>();
	
	public void save(Patient newPatient) throws AlreadyUsedIppException
	{
		patientsList.put(newPatient.getIpp(), newPatient);
	}
	
	public Optional<Patient> findPatientByIpp(String ipp)
	{
		
		Optional<Patient> patientSearched = Optional.ofNullable(patientsList.get(ipp));
		return patientSearched;
	}
	
	public boolean existsByIpp(String ipp)
	{
		if(patientsList.containsKey(ipp))
			return true;
		return false;
	}
}
