package com.glabaden.medlit.exception;

public class AlreadyUsedIppException extends Exception{
	public AlreadyUsedIppException()
	{
		super("The IPP is already used by another Patient. ");
	}
}
