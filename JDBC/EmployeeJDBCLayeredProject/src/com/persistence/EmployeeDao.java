package com.persistence;

import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Employee;

public interface EmployeeDao {
	ArrayList<Employee> getAllRecords() throws ClassNotFoundException, SQLException;
	Employee searchRecord(int empId);
	boolean insertData(Employee employee);
	boolean deleteData(int empId);
	boolean updateSalary(int empId,int empSalary);
}
