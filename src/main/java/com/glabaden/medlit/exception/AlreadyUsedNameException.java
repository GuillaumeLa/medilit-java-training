package com.glabaden.medlit.exception;

public class AlreadyUsedNameException extends Exception{
	public AlreadyUsedNameException() {
		super("The name used is already a key to another service.");
	}
}
