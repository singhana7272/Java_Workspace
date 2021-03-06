package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Employee;
import com.exception.EmployeeNotFoundException;

public interface EmployeeService {
	ArrayList<Employee> getAllEmployees() throws ClassNotFoundException, SQLException;
	Employee searchEmployee(int empId) throws ClassNotFoundException, SQLException, EmployeeNotFoundException;
	boolean insertEmployee(Employee employee) throws ClassNotFoundException, SQLException;
	boolean deleteEmployee(int empId) throws ClassNotFoundException, SQLException;
	boolean updateSalary(int empId,int salary) throws ClassNotFoundException, SQLException;
}
