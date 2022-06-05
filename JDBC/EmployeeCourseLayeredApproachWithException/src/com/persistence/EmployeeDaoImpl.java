package com.persistence;

import com.beans.Employee;

import com.database.EmployeeDatabase;
import com.exception.EmployeeNotFoundException;

public class EmployeeDaoImpl implements EmployeeDao{

	EmployeeDatabase employeeDatabase=new EmployeeDatabase();
	
	@Override
	public Employee getEmployeeById(int employeeId) throws EmployeeNotFoundException{
		Employee[] employees=employeeDatabase.getEmployees();
		
		for(Employee employee : employees) {
			if(employee.getEmpId()==employeeId)
				return employee;
		}
				
		throw new EmployeeNotFoundException("Employee with " + employeeId +" does not exist");
		
	}

}
