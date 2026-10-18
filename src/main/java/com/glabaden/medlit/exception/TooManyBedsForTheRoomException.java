package com.glabaden.medlit.exception;

public class TooManyBedsForTheRoomException extends Exception{
	public TooManyBedsForTheRoomException() {
		super("You are above the limits of beds for the room.");
	}

}
