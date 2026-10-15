package com.glabaden.medlit.entity;

import java.time.LocalDate;

public class Patient {
	
	private String ipp;
	private String name;
	private String firstName;
	private LocalDate birthDate;
	
	
	// Constructeur 
	public Patient(String ipp, String name, String firstName, LocalDate birthDate)
	{
		this.ipp = ipp;
		this.name = name;
		this.firstName = firstName;
		this.birthDate = birthDate;
	}
	// Getter 
	public String getIpp()
	{
		return ipp;
	}
	public String getName()
	{
		return name;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public Date getBirthDate()
	{
		return birthDate;
	}
}
