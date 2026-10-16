package com.glabaden.medlit;


import com.glabaden.medlit.entity.HospitalDepartment;
import com.glabaden.medlit.entity.Room;
import com.glabaden.medlit.entity.RoomType;
import com.glabaden.medlit.exception.RoomNumberAlreadyUsed;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        HospitalDepartment hospitalDepartmentTest = new HospitalDepartment("Cardiologie");
        Room room_one = new Room("R001", RoomType.SIMPLE);
        try {
			hospitalDepartmentTest.saveRoom(room_one);
			
		} catch (RoomNumberAlreadyUsed e) {
			System.out.println("Room already used.");
		}
        
        
    }
}
