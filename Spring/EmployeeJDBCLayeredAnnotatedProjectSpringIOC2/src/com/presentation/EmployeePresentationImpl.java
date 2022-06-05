package com.presentation;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Employee;
import com.exception.EmployeeNotFoundException;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;

@Component("employeePresentation")
public class EmployeePresentationImpl implements EmployeePresentation {
	
	@Autowired
	private EmployeeService employeeService; 
	
	
	private EmployeePresentationImpl() {	
	}
	
	
	
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}



	public EmployeePresentationImpl(EmployeeService employeeService) {
		this.employeeService=employeeService;
	}

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
		Scanner scanner=new Scanner(System.in);
		try {
		switch (choice) {
		case 1:
			ArrayList<Employee> employees=null;
			employees = employeeService.getAllEmployees();
			for(Employee employee:employees) 
				System.out.println(employee);
			
			break;
			
		case 2:
			System.out.println("Enter employee id");
			int empId=Integer.parseInt(scanner.next());;
			Employee employee = employeeService.searchEmployee(empId);
			System.out.println(employee);
			
			break;
			
		
		case 3:
			System.out.println("Enter employee id");
			empId=Integer.parseInt(scanner.next());
			System.out.println("Enter employee name");
			String empName=scanner.next();
			System.out.println("Enter Department");
			String deptt=scanner.next();
			System.out.println("Enter Designation");
			String desig=scanner.next();
			System.out.println("Enter Salary");
			int sal=Integer.parseInt(scanner.next());
			
			employee=new Employee(empId,empName,deptt,desig,sal);
			
			boolean status = employeeService.insertEmployee(employee);
			
			if(status)
				System.out.println("Employee added successfully");
			else
				System.out.println("Employee addition failed");
			
			break;
			
		case 4:
			System.out.println("Enter employee id:");
			empId=Integer.parseInt(scanner.next());
			status=employeeService.deleteEmployee(empId);
			if(status) 
				System.out.println("Employee deleted successfully");
			else
				System.out.println("Employee deletion failed");
			break;
			
		case 5:
			System.out.println("Enter employee Id");
			empId=Integer.parseInt(scanner.next());
			System.out.println("Enter salary");
			int salary=Integer.parseInt(scanner.next());
			status=employeeService.updateSalary(empId, salary);
			
			break;
			
		case 6:
			System.out.println("Thanks for using Employee Management System");
			System.exit(0);
			
		default:
			System.out.println("You have entered an invalid choice");
		    break;
		}}
//		catch(InvalidInputMismatchException | EmployeeNotFoundException e) {
//			e.getMessage();
//		}
		catch(ClassNotFoundException |SQLException |EmployeeNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	
	}

}
