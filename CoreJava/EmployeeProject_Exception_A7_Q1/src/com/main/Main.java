package com.main;

import java.util.Scanner;
import java.util.Set;
import com.beans.Employee;
import com.exception.EmployeeAlreadyExistException;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		EmployeeService employeeService=new EmployeeServiceImpl();
		
		while(true){	
		try {	
		System.out.println("1.Add Employee");
		System.out.println("2.List All employees");
		System.out.println("3.Exit");
		
		int choice=Integer.parseInt(sc.nextLine());
		switch(choice) {
		
		case 1:
		    System.out.println("Enter Employee name");
		    String employeeName=sc.nextLine();
		    System.out.println("Enter Employee age");
		    int age=Integer.parseInt(sc.nextLine());
		    boolean status=employeeService.addEmployee(employeeName,age);
		    if(status)
		    	System.out.println("Employee added successfully");
	        break;
	         
		case 2:
			Set<Employee> employees=employeeService.getAllEmployee();
			for(Employee employee : employees) {
				System.out.println(employee);
			}
			break;
			
		case 3:
			System.out.println("Thank you for visiting us. Kindly visit us again.");
			System.exit(0);
			
		default:
			System.out.println("Invalid choice");
		    break;
		    
		    }
		}
		catch(EmployeeAlreadyExistException exp) {
			System.out.println(exp.getMessage());
		}
		System.out.println();
		}
	}
}	