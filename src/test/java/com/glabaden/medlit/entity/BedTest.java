package com.glabaden.medlit.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BedTest {
	
	@Test
	@DisplayName("Given un lit nouvellement créé, When je consulte son état, Then il est LIBRE.")
	void bedStateAvailableAtCreation() {
		Bed newBed = new Bed("B001");
		assertEquals(BedStatus.AVAILABLE, newBed.getBedStatus());
	}
	
}
