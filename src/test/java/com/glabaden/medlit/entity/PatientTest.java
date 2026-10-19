package com.glabaden.medlit.entity;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PatientTest {
	@Test
	@DisplayName("US-01 : un nom vide est invalide")
	void refuseEmptyName() {
        assertThrows(IllegalArgumentException.class,
            () -> new Patient("P-0001", "", "Jean", LocalDate.of(1990, 5, 12)));
	}
	@Test
	@DisplayName("US-01 : un nom null est invalide")
	void refuseNullName() {
        assertThrows(IllegalArgumentException.class,
            () -> new Patient("P-0001", null, "Jean", LocalDate.of(1990, 5, 12)));
	}
	@Test
	@DisplayName("US-01 : un prenom vide est invalide")
	void refuseEmptyFirstName() {
        assertThrows(IllegalArgumentException.class,
            () -> new Patient("P-0001", "LA", "", LocalDate.of(1990, 5, 12)));
	}
	@Test
	@DisplayName("US-01 : un prenom null est invalide")
	void refuseNullFirstName() {
        assertThrows(IllegalArgumentException.class,
            () -> new Patient("P-0001", "LA", null, LocalDate.of(1990, 5, 12)));
	}
	@Test	
	@DisplayName("US-01: la date de naissance dans le futur est invalide.")
	void refuseFuturBirthdate() {
		assertThrows(IllegalArgumentException.class, 
		() -> new Patient("P-001","Name","OtherName",LocalDate.now().plusDays(2)));
	}
	@Test
	@DisplayName("US-01 : un PATIENT nominale")
	void creePatientValide() {
	    Patient p = new Patient("P-0001", "Dupont", "Jean", LocalDate.of(1990, 5, 12));

	    assertAll(
	        () -> assertEquals("P-0001", p.getIpp()),
	        () -> assertEquals("Dupont", p.getName()),
	        () -> assertEquals(LocalDate.of(1990, 5, 12), p.getBirthDate())
	    );
	}
}
