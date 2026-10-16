package com.glabaden.medlit;

import java.time.LocalDate;


import com.glabaden.medlit.entity.Patient;
import com.glabaden.medlit.exception.AlreadyUsedIppException;
import com.glabaden.medlit.repository.PatientRepository;
import com.glabaden.medlit.service.PatientService;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        PatientService patientService = new PatientService(new PatientRepository());

        try {
        	Patient test = new Patient("P-001", "Labadens d'arc", "Guillaume", LocalDate.of(2030, 04, 26));
			patientService.registerPatient(test);
		} catch (IllegalArgumentException e) {
			System.out.println("Format Patient Invalide : " + e.getMessage());
		} catch (AlreadyUsedIppException e) {
			System.out.println("IPP already Used");
		}
//        try {
//			patientService.registerPatient(test);
//		} catch (AlreadyUsedIppException e) {
//			System.out.println("Failed");
//		}
    }
}
