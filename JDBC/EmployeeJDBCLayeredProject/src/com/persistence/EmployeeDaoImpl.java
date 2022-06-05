package com.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public ArrayList<Employee> getAllRecords() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","admin");
		
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
	public Employee searchRecord(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertData(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteData(int empId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateSalary(int empId,int empSalary) {
		// TODO Auto-generated method stub
		return false;
	}

}
