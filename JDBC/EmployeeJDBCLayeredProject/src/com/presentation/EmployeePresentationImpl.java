package com.presentation;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.bean.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;

public class EmployeePresentationImpl implements EmployeePresentation {
	
	EmployeeService employeeService=new EmployeeServiceImpl();

	@Override
	public void showMenu() {
		System.out.println("1. List All Employees");
		System.out.println("2. Search Employee");
		System.out.println("3. Add Employee");
		System.out.println("4. Delete Employee");
		System.out.println("5. Update Salary");
		System.out.println("6. Exit");
	}

	@Override
	public void performMenu(int choice) {
		Scanner sc=new Scanner(System.in);
		switch (choice) {
		case 1:
			ArrayList<Employee> employees=null;
			try {
				employees = employeeService.getAllEmployees();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			for(Employee employee:employees) 
				System.out.println(employee);
			
		
			break;
		case 6:
			System.out.println("Thanks for using Employee Management System");
			System.exit(0);
		default:
		break;
	}
	


	}

}
