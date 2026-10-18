package com.glabaden.medlit;

import java.util.List;
import java.util.NoSuchElementException;
import com.glabaden.medlit.entity.HospitalDepartment;
import com.glabaden.medlit.entity.Room;
import com.glabaden.medlit.entity.RoomType;
import com.glabaden.medlit.exception.AlreadyUsedNameException;
import com.glabaden.medlit.exception.RoomNumberAlreadyUsedException;
import com.glabaden.medlit.repository.HospitalDepartmentRepository;
import com.glabaden.medlit.service.HospitalDepartmentService;


/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		HospitalDepartmentRepository departmentsRepository = new HospitalDepartmentRepository();
		HospitalDepartmentService app = new HospitalDepartmentService(departmentsRepository);
		
		HospitalDepartment cardiologieDepartment = new HospitalDepartment("Cardiologie");
		HospitalDepartment emergencyDepartment = new HospitalDepartment("Emergency");
		
		try {
			app.registerDepartmentService(emergencyDepartment);
			app.registerDepartmentService(cardiologieDepartment);
			
		 	HospitalDepartment cardiOptional = departmentsRepository.getHospitalDepartmentByName("Emergency").get();
		 	cardiOptional.saveRoom(new Room("R-001", RoomType.DOUBLE));
		 	List<Room> rooms = cardiOptional.getAllRooms();	
		 	Room room_one = rooms.get(0);
		 	room_one.getAllBeds().forEach(bed -> System.out.println(bed.getId()));
		 	System.out.println(room_one.getRoomNumber());
		 	
			
		} catch (AlreadyUsedNameException e) {
			System.out.println("Service name already Used");
		} catch (NoSuchElementException e) {
			System.out.println("Any Optionnal so getFunctionFailed");
		} catch (RoomNumberAlreadyUsedException e) {
			System.out.println("Room number already Used");
		}
		

	}
}
