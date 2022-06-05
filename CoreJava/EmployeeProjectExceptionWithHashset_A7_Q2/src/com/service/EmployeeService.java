package com.service;

import com.beans.Employee;
import com.exception.EmployeeAlreadyExistException;
import java.util.ArrayList;

public interface EmployeeService {

	boolean addEmployee(String employeeName, int age) throws EmployeeAlreadyExistException;

	boolean searchEmployee(String employeeName,int age);
	
	ArrayList<Employee> getAllEmployee();
}
