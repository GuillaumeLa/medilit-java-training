package com.glabaden.medlit.entity;


import java.util.List;
import java.util.HashMap;
import java.util.Map;

import com.glabaden.medlit.exception.RoomNumberAlreadyUsedException;

public class HospitalDepartment {

	private String name;
	private final Map<String, Room> rooms = new HashMap<String, Room>();
	
	public HospitalDepartment(String name) {
		if(name == null || name.isBlank())
			throw new IllegalArgumentException();
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	public void saveRoom(Room newRoom) throws RoomNumberAlreadyUsedException
	{
		if(rooms.containsKey(newRoom.getRoomNumber())) {
			throw new RoomNumberAlreadyUsedException();
		}

		rooms.put(newRoom.getRoomNumber(), newRoom);
	}
	public List<Room> getAllRooms(){
		return List.copyOf(rooms.values());
	}
	
}
