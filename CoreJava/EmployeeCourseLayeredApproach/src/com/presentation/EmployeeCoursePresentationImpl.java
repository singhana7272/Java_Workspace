package com.presentation;

import java.util.Scanner;

import com.beans.Course;
import com.beans.Employee;
import com.service.CourseService;
import com.service.CourseServiceImpl;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;

public class EmployeeCoursePresentationImpl implements EmployeeCoursePresentation{
	
	
	EmployeeService employeeService=new EmployeeServiceImpl();
	CourseService courseService=new CourseServiceImpl();
	
	Scanner sc=new Scanner(System.in);

	@Override
	public void showMenu() {
		System.out.println("1. Show all courses");
		System.out.println("2. Register for course");
		System.out.println("3. Deregister for course");
		System.out.println("4. List of participants for specific courses");
		System.out.println("5. Exit");
	}

	@Override
	public void performMenu(int choice) { 
		
		
		switch(choice) {
		case 1:
			Course courses[]=courseService.getAllCoursesForEmployee();
			
			for(Course course:courses) {
				System.out.println(course);
			}
			break;
		
		case 2:
			System.out.println("Enter employee ID for registering employee");
			int registerEmployeeId=sc.nextInt();
			Employee registerEmployee=employeeService.searchEmployeeById(registerEmployeeId);
			System.out.println("Enter course Id for registering employee");
			String registerCourseId=sc.next();
			
			boolean statusRegister=courseService.registerEmployeeForCourse(registerCourseId,registerEmployee);
			
			if(statusRegister==true)
				System.out.println("Employee registered successfully!");
			else
				System.out.println("Employee can not register for this course this time");
			
			break;
			
		case 3:
			System.out.println("Enter employee ID for deregistering employee");
			int deregisterEmployeeId=sc.nextInt();
			Employee deregisterEmployee=employeeService.searchEmployeeById(deregisterEmployeeId);
			System.out.println("Enter course Id for deregistering employee");
			String deregisterCourseId=sc.next();
			
			boolean statusDeregister=courseService.deregisterEmployeeForCourse(deregisterCourseId,deregisterEmployee);
			
			if(statusDeregister)
				System.out.println("Employee deregistered successfully!");
			else
				System.out.println("Employee can not be deregistered");
			
			break;
			
		case 4:
			System.out.println("Enter the id of course");
			String courseId=sc.next();
			Employee employees[]=courseService.getAllEmployeeForSpecificCourse(courseId);
			for(Employee emp: employees) {
				if(emp==null) break;
					System.out.println(emp);
			}
			break;
			
		case 5:
			System.out.println("Thanks for using our system. Kindly visit us again");
			System.exit(0);
			
		default:
			System.out.println("You have entered invalid choice");
			 
		}
	}

}
