package com.exception;

public class EmployeeAlreadyExistException extends Exception{
	public EmployeeAlreadyExistException(String message) {
		super(message);
	}
}
