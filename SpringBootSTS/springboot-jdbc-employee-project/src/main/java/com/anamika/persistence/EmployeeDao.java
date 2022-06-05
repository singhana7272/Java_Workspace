package com.anamika.persistence;

import java.sql.SQLException;
import java.util.ArrayList;

import com.anamika.bean.Employee;
import com.anamika.exception.EmployeeNotFoundException;

public interface EmployeeDao {
	ArrayList<Employee> getAllRecords();
	Employee searchRecord(int empId) throws EmployeeNotFoundException;
	boolean insertData(Employee employee);
	boolean deleteData(int empId);
	boolean updateSalary(int empId,int empSalary);
}
