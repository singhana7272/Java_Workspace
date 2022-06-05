package com.anamika.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.anamika.bean.Employee;
import com.anamika.exception.EmployeeNotFoundException;

public interface EmployeeService {
	ArrayList<Employee> getAllEmployees();
	Employee searchEmployee(String empId) throws EmployeeNotFoundException;
	boolean insertEmployee(Employee employee);
	boolean deleteEmployee(String empId);
	boolean updateSalary(String empId,int salary);
}
