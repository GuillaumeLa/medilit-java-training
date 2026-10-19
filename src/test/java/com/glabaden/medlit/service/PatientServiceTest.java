package com.glabaden.medlit.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.glabaden.medlit.entity.Patient;
import com.glabaden.medlit.exception.AlreadyUsedIppException;
import com.glabaden.medlit.repository.PatientRepository;

public class PatientServiceTest {
	private PatientRepository patientRepository;
	private PatientService patientService;
	@BeforeEach
	public void setup() {
		patientRepository = new PatientRepository();
		patientService =  new PatientService(patientRepository);
	}
	
	@Test
	@DisplayName("US-01 si doublon de patient IPP erreur AlreadyUsedIppException.")
	public void checkIppAlreadyUsed() throws Exception{
		Patient patientOne = new Patient("P-000","Named","FirstName", LocalDate.of(2004, 05, 26));
		Patient patientDouble = new Patient("P-000", "Name","OtherFirstName", LocalDate.of(2003, 05, 26));
		patientService.registerPatient(patientOne);
		assertThrows(AlreadyUsedIppException.class, ()-> patientService.registerPatient(patientDouble));
		assertEquals("Named", patientService.getPatientByIpp("P-000").get().getName());
	}
	
}

