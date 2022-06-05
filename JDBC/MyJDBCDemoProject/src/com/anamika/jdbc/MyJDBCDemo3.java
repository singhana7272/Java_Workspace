package com.anamika.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyJDBCDemo3 {

public static void main(String[] args) {
		
		Connection connection=null;
		PreparedStatement preparedStatement;
		Statement statement=null;
		Scanner scanner=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "admin");
			
			
			System.out.println("Enter employee id:");
			int id=Integer.parseInt(scanner.next());
			System.out.println("Enter employee name");
			String name=scanner.next();
			System.out.println("Enter Department");
			String deptt=scanner.next();
			System.out.println("Enter Designation");
			String desig=scanner.next();
			System.out.println("Enter Salary");
			int sal=Integer.parseInt(scanner.next());
			
			preparedStatement=connection.prepareStatement("INSERT INTO EMPLOYEES(ID,NAME,DEPARTMENT,DESIGNATION,SALARY) VALUES(?,?,?,?,?)");
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, deptt);
			preparedStatement.setString(4,desig);
			preparedStatement.setInt(5, sal);
//			statement=connection.createStatement();
//			int row=statement.executeUpdate("INSERT INTO EMPLOYEES(ID,NAME,DEPARTMENT,DESIGNATION,SALARY) VALUES("+id+",'"+name+"','"+deptt+"','"+desig+"','"+sal+"')");
			
			int rows=preparedStatement.executeUpdate();
			if(rows>0)
				System.out.println("Employee added successfully");
			else
				System.out.println("Employee addition failed");
				
			
		} 
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
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
