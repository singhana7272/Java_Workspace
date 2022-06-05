package com.anamika.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anamika.bean.Employee;
import com.anamika.exception.EmployeeNotFoundException;
import com.anamika.persistence.EmployeeDao;


@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
	private EmployeeDao employeeDao;

	@Override
	public ArrayList<Employee> getAllEmployees(){
		return (ArrayList<Employee>)employeeDao.findAll();
	}

	@Override
	public Employee searchEmployee(String empId) throws EmployeeNotFoundException {
		return employeeDao.findById(empId).get();
	}

	@Override
	public boolean insertEmployee(Employee employee) {
		Employee emp=employeeDao.save(employee);
		if(emp!=null)
			return true;
		else return false;
	}

	@Override
	public boolean deleteEmployee(String empId) {
		employeeDao.deleteById(empId);
		return false;
	}

	@Override
	public boolean updateSalary(String empId, int salary) {
		int rows=employeeDao.updateSalary(empId, salary);
		if(rows==1)
			return true;
		else return false;
	}


}
