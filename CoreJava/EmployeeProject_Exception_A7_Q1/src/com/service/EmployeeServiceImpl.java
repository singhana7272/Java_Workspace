package com.service;

import java.util.Set;
import com.beans.Employee;
import com.database.EmployeeDatabase;
import com.exception.EmployeeAlreadyExistException;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDatabase employeeDatabase = new EmployeeDatabase();

	@Override
	public boolean addEmployee(String employeeName, int age) throws EmployeeAlreadyExistException {
		Employee employee = new Employee(employeeName, age);
		if (!this.searchEmployee(employee)) {
			employeeDatabase.getEmployeeSet().add(new Employee(employeeName, age));
			return true;
		}
		throw new EmployeeAlreadyExistException("Employee " + employeeName + " with age " + age + " already exist");
	}

	@Override
	public boolean searchEmployee(Employee employee) {
		if (employeeDatabase.getEmployeeSet().contains(employee))
			return true;
		return false;
	}

	@Override
	public Set<Employee> getAllEmployee() {
		Set<Employee> employees = employeeDatabase.getEmployeeSet();
		return employees;
	}

}
