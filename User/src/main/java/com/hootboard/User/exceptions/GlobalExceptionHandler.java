package com.hootboard.User.exceptions;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(NoSuchElementException.class)
	protected ResponseEntity<String> handleNoSuchElementException(NoSuchElementException ex)
	{
		 return new ResponseEntity<>(ex+"User not found", HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler(EmptyInputException.class)
	protected ResponseEntity<String> handleEmptyInputException(EmptyInputException ex)
	{
		 return new ResponseEntity<>(ex+"input can't be empty", HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler(NullPointerException.class)
	protected ResponseEntity<String> handleEmptyInputException(NullPointerException ex)
	{
		 return new ResponseEntity<>(ex+"input can't be empty", HttpStatus.NOT_FOUND);
		
	}
	
	

}
