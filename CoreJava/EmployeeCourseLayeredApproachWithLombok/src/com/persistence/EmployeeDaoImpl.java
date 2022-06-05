package com.persistence;

import com.beans.Employee;
import com.database.EmployeeDatabase;

public class EmployeeDaoImpl implements EmployeeDao{

	EmployeeDatabase employeeDatabase=new EmployeeDatabase();
	
	@Override
	public Employee getEmployeeById(int employeeId) {
		Employee[] employees=employeeDatabase.getEmployees();
		
		for(Employee employee : employees) {
			if(employee.getEmpId()==employeeId)
				return employee;
		}
				
		return null;
	}

}
