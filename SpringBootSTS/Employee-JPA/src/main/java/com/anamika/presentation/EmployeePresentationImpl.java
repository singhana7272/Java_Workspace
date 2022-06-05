package com.anamika.presentation;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anamika.bean.Employee;
import com.anamika.exception.EmployeeNotFoundException;
import com.anamika.service.EmployeeService;

@Component
public class EmployeePresentationImpl implements EmployeePresentation {
	
	@Autowired
	private EmployeeService employeeService; 

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
			ArrayList<Employee> employees=employeeService.getAllEmployees();
			for(Employee employee:employees) 
				System.out.println(employee);
			break;
			
		case 2:
			System.out.println("Enter employee id");
			String empId=scanner.nextLine();
			Employee emp = employeeService.searchEmployee(empId);
			System.out.println(emp);
			break;
			
		
		case 3:
//			System.out.println("Enter employee id");
//			employee.setId(scanner.nextLine());
//			System.out.println("Enter employee name");
//			employee.setName(scanner.nextLine());
//			System.out.println("Enter Department");
//			employee.setDepartment(scanner.nextLine());
//			System.out.println("Enter Designation");
//			employee.setDesignation(scanner.nextLine());
//			System.out.println("Enter Salary");
//			employee.setSalary(Integer.parseInt(scanner.nextLine()));            
//			
			System.out.println("Enter employee id");
			String id=scanner.nextLine();
			System.out.println("Enter employee name");
			String name=scanner.nextLine();
			System.out.println("Enter Department");
			String dept=scanner.nextLine();
			System.out.println("Enter Designation");
			String desig=scanner.nextLine();
			System.out.println("Enter Salary");
			int sal=Integer.parseInt(scanner.nextLine());
			boolean status = employeeService.insertEmployee(
					new Employee(id, name, dept, desig, sal));
			
			if(status)
				System.out.println("Employee added successfully");
			else
				System.out.println("Employee addition failed");
			
			break;
			
		case 4:
			System.out.println("Enter employee id:");
			empId=scanner.nextLine();
			status=employeeService.deleteEmployee(empId);
			if(status) 
				System.out.println("Employee deleted successfully");
			else
				System.out.println("Employee deletion failed");
			break;
			
		case 5:
			System.out.println("Enter employee Id");
			empId=scanner.nextLine();
			System.out.println("Enter salary");
			int salary=Integer.parseInt(scanner.next());
			status=employeeService.updateSalary(empId, salary);
			if (status)
				System.out.println("Salary Updated");
			else
				System.out.println("Updation Failed");
			break;
			
		case 6:
			System.out.println("Thanks for using Employee Management System");
			System.exit(0);
			
		default:
			System.out.println("You have entered an invalid choice");
		    break;
		}}
		catch(EmployeeNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	
	}

}
