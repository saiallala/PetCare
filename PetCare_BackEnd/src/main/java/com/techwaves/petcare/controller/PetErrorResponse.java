package com.techwaves.petcare.controller;

public class PetErrorResponse {
	
	private int status;
	private String message;
	private long timeStamp;
	public PetErrorResponse() {
		
	}
	public PetErrorResponse(int status, String message, long l) {
		super();
		this.status = status;
		this.message = message;
		this.timeStamp = l;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(int timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	

}
