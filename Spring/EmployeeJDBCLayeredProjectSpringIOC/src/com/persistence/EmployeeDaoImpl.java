package com.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.bean.Employee;
import com.exception.EmployeeNotFoundException;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private static final String url="jdbc:mysql://localhost:3306/employeedb";
	private static final String user="root";
	private static final String password="admin";

	@Override
	public ArrayList<Employee> getAllRecords() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection(url,user,password);
		String query="SELECT * FROM EMPLOYEES";
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		ResultSet resultSet= preparedStatement.executeQuery();
		ArrayList<Employee> employees=new ArrayList<>();
		
		while(resultSet.next()) {
			int id=resultSet.getInt("ID");
			String name=resultSet.getString("NAME");
			String department=resultSet.getString("DEPARTMENT");
			String designation=resultSet.getString("DESIGNATION");
			int salary=resultSet.getInt("SALARY");
			
			employees.add(new Employee(id,name,department,designation,salary));
		}
		connection.close();
		
		return employees;
	}

	@Override
	public Employee searchRecord(int empId) throws ClassNotFoundException, SQLException , EmployeeNotFoundException{
		
        Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection(url,user,password);
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM EMPLOYEES WHERE ID=?");
		preparedStatement.setInt(1,empId);
		ResultSet resultSet= preparedStatement.executeQuery();
		
		while(resultSet.next()) {
			int id=resultSet.getInt("ID");
			String name=resultSet.getString("NAME");
			String department=resultSet.getString("DEPARTMENT");
			String designation=resultSet.getString("DESIGNATION");
			int salary=resultSet.getInt("SALARY");
			
			return new Employee(id,name,department,designation,salary);
		}
		connection.close();
		
		throw new EmployeeNotFoundException("Employee with id "+empId+" does not exist");
	}

	@Override
	public boolean insertData(Employee employee) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection(url,user,password);
		PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO EMPLOYEES(ID,NAME,DEPARTMENT,DESIGNATION,SALARY) VALUES(?,?,?,?,?)");
		preparedStatement.setInt(1, employee.getEmpId());
		preparedStatement.setString(2, employee.getEmpName());
		preparedStatement.setString(3, employee.getEmpDepartment());
		preparedStatement.setString(4, employee.getEmpDesignation());
		preparedStatement.setInt(5, employee.getEmpSalary());
		
		int rows=preparedStatement.executeUpdate();
		
		connection.close();
		
		if(rows>0)
			return true;
		else
			return false;
		}

	@Override
	public boolean deleteData(int empId) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection(url,user,password);
		PreparedStatement preparedStatement=connection.prepareStatement("DELETE FROM EMPLOYEES WHERE ID=?");
		preparedStatement.setInt(1, empId);
		int rows=preparedStatement.executeUpdate();
		connection.close();
		
		if(rows>0)
			return true;
		else
			return false;
	}

	@Override
	public boolean updateSalary(int empId,int empSalary) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection(url,user,password);
		PreparedStatement preparedStatement=connection.prepareStatement("UPDATE EMPLOYEES SET SALARY=? WHERE ID=?");
		preparedStatement.setInt(1, empSalary);
		preparedStatement.setInt(2, empId);
		int rows=preparedStatement.executeUpdate();
        connection.close();
		
		if(rows>0)
			return true;
		else
			return false;
		
	}

}
