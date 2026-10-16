package com.glabaden.medlit.exception;

public class RoomNumberAlreadyUsed extends Exception{
	public RoomNumberAlreadyUsed() {
		super("The room number is already used in the service.");
	}
}
