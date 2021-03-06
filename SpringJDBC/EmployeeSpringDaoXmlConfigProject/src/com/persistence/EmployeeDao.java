package com.persistence;

import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Employee;
import com.exception.EmployeeNotFoundException;

public interface EmployeeDao {
	ArrayList<Employee> getAllRecords();
	Employee searchRecord(int empId) throws EmployeeNotFoundException;
	boolean insertData(Employee employee);
	boolean deleteData(int empId);
	boolean updateSalary(int empId,int empSalary);
}
