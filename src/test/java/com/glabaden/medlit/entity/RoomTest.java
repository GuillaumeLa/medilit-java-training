package com.glabaden.medlit.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RoomTest {
	

	@Test
	@DisplayName("1. Given une chambre double, When elle est créée, Then elle contient exactement 2 lit.")
	void doubleRoomHasTwoBed() {
		Room newRoom = new Room("R-001", RoomType.DOUBLE);
		assertEquals(2, newRoom.getAllBeds().size());
	}
	@Test
	@DisplayName("1. Given une chambre simple, When elle est créée, Then elle contient exactement 1 lit.")
	void simpleRoomHasOneBed() {
		Room newRoom = new Room("R-001", RoomType.SIMPLE);
		assertEquals(1, newRoom.getAllBeds().size());
	}
	@Test
	@DisplayName("1. Given une chambre isolement, When elle est créée, Then elle contient exactement 1 lit.")
	void isolationRoomHasOneBed() {
		Room newRoom = new Room("R-001", RoomType.ISOLATION);
		assertEquals(1, newRoom.getAllBeds().size());
	}
}
