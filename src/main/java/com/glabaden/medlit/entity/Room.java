package com.glabaden.medlit.entity;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Room {
	
	private RoomType roomType;
	private String roomNumber;
	private Map<String, Bed> beds =  new HashMap<String, Bed>();
	
	public Room(String roomNumber, RoomType roomType)
	{
		if(roomNumber == null || roomNumber.isBlank())
			throw new IllegalArgumentException();
		if(roomType == null)
			throw new IllegalArgumentException();
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		switch (roomType) {
			case SIMPLE, ISOLATION: {
				beds.put("BED00", new Bed("BED00"));
				break;
			}
			case DOUBLE:{
				beds.put("BED00", new Bed("BED00"));
				beds.put("BED01", new Bed("BED01"));
				break;
			}
		}
	}
	
	public List<Bed> getAllBeds() {
		return List.copyOf(beds.values());
	}
	
	public String getRoomNumber()
	{
		return this.roomNumber;
	}
	public RoomType getRoomType()
	{
		return this.roomType;
	}
	
}
