package com.glabaden.medlit.exception;

public class TooManyBedsForTheRoom extends Exception{
	public TooManyBedsForTheRoom() {
		super("You are above the limits of beds for the room.");
	}

}
