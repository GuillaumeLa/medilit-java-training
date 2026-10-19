package com.glabaden.medlit.service;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.glabaden.medlit.entity.HospitalDepartment;
import com.glabaden.medlit.entity.Room;
import com.glabaden.medlit.entity.RoomType;
import com.glabaden.medlit.exception.RoomNumberAlreadyUsedException;
import com.glabaden.medlit.repository.HospitalDepartmentRepository;

public class HospitalDepartmentServiceTest {
	HospitalDepartmentRepository departmentRepository;
	HospitalDepartmentService departmentService;
	
	@BeforeEach
	void setup() {
		 departmentRepository = new HospitalDepartmentRepository();
		 departmentService = new HospitalDepartmentService(departmentRepository);
	}
	
	@Test
	@DisplayName("1. Given un service qui a déjà une chambre 101, When j'ajoute une autre chambre 101, Then l'ajout est refusé.")
	void nameAlreadyUsedInServiceForTheRoom() throws Exception {
		departmentService.registerDepartmentService(new HospitalDepartment("Cardiologie"));
		HospitalDepartment cardiologie = departmentService.getDepartmentByName("Cardiologie");
		
		cardiologie.saveRoom(new Room("R-001", RoomType.DOUBLE));
		assertThrows(RoomNumberAlreadyUsedException.class,() -> cardiologie.saveRoom(new Room("R-001", RoomType.SIMPLE)));
		
		
	}
	
}
