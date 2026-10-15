package com.glabaden.medlit.repository;

import java.util.HashMap;
import java.util.Map;

import com.glabaden.medlit.entity.Patient;
import com.glabaden.medlit.exception.AlreadyUsedIppException;

public class PatientRepository {
	private Map<String, Patient> patientsList = new HashMap<String, Patient>();
	
	public void addPatient(Patient newPatient) throws AlreadyUsedIppException
	{
		if(patientsList.containsKey(newPatient.getIpp()))
			throw new AlreadyUsedIppException();
		patientsList.put(newPatient.getIpp(), newPatient);
	}

}
