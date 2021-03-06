package com.persistence;

import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Employee;
import com.exception.EmployeeNotFoundException;

public interface EmployeeDao {
	ArrayList<Employee> getAllRecords() throws ClassNotFoundException, SQLException;
	Employee searchRecord(int empId) throws ClassNotFoundException, SQLException, EmployeeNotFoundException;
	boolean insertData(Employee employee) throws ClassNotFoundException, SQLException;
	boolean deleteData(int empId) throws SQLException, ClassNotFoundException;
	boolean updateSalary(int empId,int empSalary) throws SQLException, ClassNotFoundException;
}
