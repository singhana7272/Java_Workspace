package com.service;

import com.beans.Employee;
import com.exception.EmployeeAlreadyExistException;
import java.util.ArrayList;
import java.util.Set;

public interface EmployeeService {

	boolean addEmployee(String employeeName, int age) throws EmployeeAlreadyExistException;

//	boolean searchEmployee(String employeeName,int age);

	Set<Employee> getAllEmployee();

	boolean searchEmployee(Employee employee);
}
