package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.exception.EmployeeNotFoundException;
import com.persistence.EmployeeDao;
import com.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
	private EmployeeDao employeeDao;
	

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public ArrayList<Employee> getAllEmployees(){
		return employeeDao.getAllRecords();
	}

	@Override
	public Employee searchEmployee(int empId) throws EmployeeNotFoundException {
		return employeeDao.searchRecord(empId);
	}

	@Override
	public boolean insertEmployee(Employee employee) {
		return employeeDao.insertData(employee);
	}

	@Override
	public boolean deleteEmployee(int empId) {
		return employeeDao.deleteData(empId);
	}

	@Override
	public boolean updateSalary(int empId, int salary) {
		return employeeDao.updateSalary(empId, salary);
	}

}
