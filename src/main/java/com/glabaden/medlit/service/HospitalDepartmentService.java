package com.glabaden.medlit.service;

import com.glabaden.medlit.entity.HospitalDepartment;
import com.glabaden.medlit.exception.AlreadyUsedNameException;
import com.glabaden.medlit.exception.DepartmentNotFoundException;
import com.glabaden.medlit.repository.HospitalDepartmentRepository;

public class HospitalDepartmentService {
	private HospitalDepartmentRepository departmentRepository;
	
	public HospitalDepartmentService(HospitalDepartmentRepository hospitalDepartmentRepository) {
		this.departmentRepository = hospitalDepartmentRepository;
	}
	public void registerDepartmentService(HospitalDepartment newDepartmentService) throws AlreadyUsedNameException{
		if(departmentRepository.existsByName(newDepartmentService.getName())) {
			throw new AlreadyUsedNameException();
		}
		departmentRepository.saveHospitalDepartment(newDepartmentService);
	}
	public HospitalDepartment getDepartmentByName(String name) throws DepartmentNotFoundException {
		return departmentRepository.getHospitalDepartmentByName(name).orElseThrow(DepartmentNotFoundException::new);
		
	}
}
