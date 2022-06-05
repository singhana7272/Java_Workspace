package com.anamika.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyJDBCDemo {

	public static void main(String[] args) {
		
		Connection connection=null;
		Statement statement=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "admin");
			
			statement=connection.createStatement();
			
			ResultSet resultset=statement.executeQuery("select * from employees");
			
			while(resultset.next()) {
				int empId=resultset.getInt("id");
				String name=resultset.getString("name");
				String department=resultset.getString("department");
				String designation=resultset.getString("designation");
				int salary=resultset.getInt("salary");
				System.out.println(empId+" "+name+" "+department+" "+designation+" "+salary);
			}
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
