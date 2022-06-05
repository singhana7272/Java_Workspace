package com.service;

import com.beans.Employee;
import com.persistence.EmployeeDao;
import com.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{

	EmployeeDao employeeDao=new EmployeeDaoImpl();
			
	@Override
	public Employee searchEmployeeById(int employeeId) {
		
		return employeeDao.getEmployeeById(employeeId);
	}

}
