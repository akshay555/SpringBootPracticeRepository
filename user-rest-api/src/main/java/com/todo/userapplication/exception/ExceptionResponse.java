package com.todo.userapplication.exception;

import java.time.LocalDate;
import java.util.Date;

public class ExceptionResponse {
	
	private LocalDate timestamp;
	private String message;
	private String detail;
	public LocalDate getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public ExceptionResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExceptionResponse(LocalDate localDate, String message, String detail) {
		super();
		this.timestamp = localDate;
		this.message = message;
		this.detail = detail;
	}
	
	
}
