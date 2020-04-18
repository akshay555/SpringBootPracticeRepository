package com.todo.userapplication.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomException extends ResponseEntityExceptionHandler {

	@ExceptionHandler(UserNotFoundException.class)
	 public final ResponseEntity<Object> handlerException(Exception ex, WebRequest request) throws java.lang.Exception
	 {
		ExceptionResponse exceptionResponse =
	new ExceptionResponse(LocalDate.now(), ex.getMessage(), request.getDescription(false));
	return new ResponseEntity(exceptionResponse,HttpStatus.NOT_FOUND);
	 }
	 
	
}
