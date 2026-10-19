package com.glabaden.medlit.exception;

public class DepartmentNotFoundException extends Exception{
	public DepartmentNotFoundException() {
		super("Department hasn't been found.");
	}
}
