package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Employee;
import com.persistence.EmployeeDao;
import com.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao employeeDao=new EmployeeDaoImpl();
	@Override
	public ArrayList<Employee> getAllEmployees() throws ClassNotFoundException, SQLException {
		return employeeDao.getAllRecords();
	}

	@Override
	public Employee searchEmployee(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateSalary(int empId, int salary) {
		// TODO Auto-generated method stub
		return false;
	}

}
