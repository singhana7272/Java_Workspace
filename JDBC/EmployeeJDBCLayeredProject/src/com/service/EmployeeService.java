package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Employee;

public interface EmployeeService {
	ArrayList<Employee> getAllEmployees() throws ClassNotFoundException, SQLException;
	Employee searchEmployee(int empId);
	boolean insertEmployee(Employee employee);
	boolean deleteEmployee(int empId);
	boolean updateSalary(int empId,int salary);
}
