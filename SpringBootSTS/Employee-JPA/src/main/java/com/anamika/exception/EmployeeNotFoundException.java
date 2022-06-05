package com.anamika.exception;

import org.springframework.stereotype.Component;

public class EmployeeNotFoundException extends Exception{
	public EmployeeNotFoundException(String message) {
		super(message);
	}

}
