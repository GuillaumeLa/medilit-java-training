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
		if(ipp == null || ipp.isBlank() )
			throw new IllegalArgumentException("Invalid Ipp empty.");
		if(name == null || name.isBlank() )
			throw new IllegalArgumentException("Invalid Name empty.");
		if(firstName == null || firstName.isBlank() )
			throw new IllegalArgumentException("Invalid FirstName empty.");
		if(birthDate == null || birthDate.isAfter(LocalDate.now()) )
			throw new IllegalArgumentException("Invalid BirthDate empty or in the future.");
		
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
	public LocalDate getBirthDate()
	{
		return birthDate;
	}
}
