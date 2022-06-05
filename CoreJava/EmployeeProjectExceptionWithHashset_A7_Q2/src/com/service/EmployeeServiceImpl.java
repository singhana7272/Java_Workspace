package com.service;

import java.util.ArrayList;
import com.beans.Employee;
import com.database.EmployeeDatabase;
import com.exception.EmployeeAlreadyExistException;

public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeDatabase employeeDatabase=new EmployeeDatabase();
	
	@Override
	public boolean addEmployee(String employeeName,int age) throws EmployeeAlreadyExistException{
		
		if(!this.searchEmployee(employeeName, age)) {
			employeeDatabase.getEmployees().add(new Employee(employeeName,age));
			return true;
		}
		throw new EmployeeAlreadyExistException("Employee "+employeeName+" with age "+age+" already exist");
	}

	
	@Override
	public boolean searchEmployee(String employeeName,int age) {
		ArrayList<Employee> employees=employeeDatabase.getEmployees();
		for(Employee employee : employees) {
			if(employee.getName().equalsIgnoreCase(employeeName) && employee.getAge()==age)
				return true;
		}
		return false;
	}

	@Override
	public ArrayList<Employee> getAllEmployee() {
		ArrayList<Employee> employees=employeeDatabase.getEmployees();
		return employees;
	}

}
