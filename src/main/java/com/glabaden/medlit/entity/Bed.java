package com.glabaden.medlit.entity;

public class Bed {
	private String id;
	private BedStatus status;
	
	public Bed(String id ) {
		this.id = id;
		this.status = BedStatus.AVAILABLE;
		
	}
	public BedStatus getBedStatus() {
		return this.status;
	}
	public String getId(){
		return this.id;
	}
	
}
