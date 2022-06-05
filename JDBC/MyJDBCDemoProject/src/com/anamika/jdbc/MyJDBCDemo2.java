package com.anamika.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyJDBCDemo2 {

	public static void main(String[] args) {
		
		Connection connection=null;
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
			
			
			statement=connection.createStatement();
			int row=statement.executeUpdate("INSERT INTO EMPLOYEES(ID,NAME,DEPARTMENT,DESIGNATION,SALARY) VALUES("+id+",'"+name+"','"+deptt+"','"+desig+"','"+sal+"')");
			
			if(row>0)
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
