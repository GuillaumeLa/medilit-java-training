package com.glabaden.medlit.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.glabaden.medlit.entity.HospitalDepartment;

public class HospitalDepartmentRepository {
	private final Map<String, HospitalDepartment> hospitalDepartments = new HashMap<String, HospitalDepartment>();
	
	public boolean existsByName(String name) {
		return hospitalDepartments.containsKey(name);
	}
	
	public void saveHospitalDepartment(HospitalDepartment newHospitalDepartment) {
		hospitalDepartments.put(newHospitalDepartment.getName(), newHospitalDepartment);
	}
	
	public Optional<HospitalDepartment> getHospitalDepartmentByName(String name){
		return Optional.ofNullable(hospitalDepartments.get(name));
	}
	
	
	
}
