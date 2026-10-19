package com.glabaden.medlit.exception;

public class RoomNumberAlreadyUsedException extends Exception{
	public RoomNumberAlreadyUsedException() {
		super("The room number is already used in the service.");
	}
}
