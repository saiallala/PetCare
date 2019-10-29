package com.techwaves.petcare.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PetRestExceptionHandler {
	
	// Add an exception handler for PatientNotFoundException
	
	@ExceptionHandler
	public ResponseEntity<PetErrorResponse> handleException(PetNotFoundException exe){
		// create PatietnErrorResponse
		
		
		PetErrorResponse error = new PetErrorResponse(
																HttpStatus.NOT_FOUND.value(),
																exe.getMessage(), 
																System.currentTimeMillis());
		//return ResponseEntity
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	// Add another exception handler.. to catch any exception 

	@ExceptionHandler
	public ResponseEntity<PetErrorResponse> handleException(Exception exe){
		// create PatietnErrorResponse
		
		
		PetErrorResponse error = new PetErrorResponse(
																HttpStatus.BAD_REQUEST.value(),
																exe.getMessage(), 
																System.currentTimeMillis());
		//return ResponseEntity
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
	// Add another exception handler.. to catch any exception 
}
