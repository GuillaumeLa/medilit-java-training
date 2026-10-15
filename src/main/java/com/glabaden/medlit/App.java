package com.glabaden.medlit;

import java.time.LocalDate;
import java.util.Date;

import com.glabaden.medlit.entity.Patient;
import com.glabaden.medlit.exception.AlreadyUsedIppException;
import com.glabaden.medlit.repository.PatientRepository;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        PatientRepository patientsPool = new PatientRepository();
        
        Patient test = new Patient("P-001", "Laba", "Guillaume", LocalDate.now());
        try {
			patientsPool.addPatient(test);
			patientsPool.addPatient(test);
		} catch (AlreadyUsedIppException e) {
			System.out.println("Failed");
		}
    }
}
