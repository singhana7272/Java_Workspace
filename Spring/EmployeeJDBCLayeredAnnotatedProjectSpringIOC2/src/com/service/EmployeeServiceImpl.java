package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Employee;
import com.exception.EmployeeNotFoundException;
import com.persistence.EmployeeDao;
import com.persistence.EmployeeDaoImpl;

@Component("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public ArrayList<Employee> getAllEmployees() throws ClassNotFoundException, SQLException {
		return employeeDao.getAllRecords();
	}

	@Override
	public Employee searchEmployee(int empId) throws ClassNotFoundException, SQLException, EmployeeNotFoundException {
		return employeeDao.searchRecord(empId);
	}

	@Override
	public boolean insertEmployee(Employee employee) throws ClassNotFoundException, SQLException {
		return employeeDao.insertData(employee);
	}

	@Override
	public boolean deleteEmployee(int empId) throws ClassNotFoundException, SQLException {
		return employeeDao.deleteData(empId);
	}

	@Override
	public boolean updateSalary(int empId, int salary) throws ClassNotFoundException, SQLException {
		return employeeDao.updateSalary(empId, salary);
	}

}
