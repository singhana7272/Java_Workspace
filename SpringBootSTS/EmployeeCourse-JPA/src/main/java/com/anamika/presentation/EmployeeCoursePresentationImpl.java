package com.anamika.presentation;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.anamika.bean.Course;
import com.anamika.bean.Employee;
import com.anamika.service.CourseService;
import com.anamika.service.EmployeeService;
@Component
public class EmployeeCoursePresentationImpl implements EmployeeCoursePresentation {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private CourseService courseService;

	@Override
	public void showMenu() {
		System.out.println("1.Show all courses");
		System.out.println("2.Register for a course");
		System.out.println("3.Deregister from a course");
		System.out.println("4.List of employees for specific course");
		System.out.println("5.Exit");
	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner = new Scanner(System.in);
		switch (choice) {
		case 1:
			ArrayList<Course> courses = courseService.showAllCourses();
			for (Course course : courses) {
				System.out.println(course);
			}
			break;
		case 2:
			System.out.println("Enter employee id");
			String empId = scanner.nextLine();
			System.out.println("Enter course id");
			String courseId = scanner.nextLine();
			Employee employee = employeeService.searchEmployeeById(empId);
			if (employee != null) {
				boolean status = employeeService.register(empId, courseId);
				if (status)
					System.out.println("Employee registered successfully");
				else
					System.out.println("Registration failed");
			} else {
				System.out.println("Employee not found");
			}
			break;
		case 3:
			System.out.println("Enter employee id");
			empId = scanner.nextLine();
			System.out.println("Enter course id");
			courseId=scanner.nextLine();
			boolean status = employeeService.deregister(empId,courseId);
			if (status)
				System.out.println("Deregistration successful");
			else
				System.out.println("Dergistration failed");
			break;
		case 4:
			System.out.println("Enter course id");
			courseId = scanner.nextLine();
			ArrayList<Employee> employees = employeeService.showAllEmployeesForSpecificCourse(courseId);
			for (Employee emp : employees) {
				System.out.println(emp);
			}

			break;
		case 5:
			System.out.println("Thank You For Using Our Application. Kindly Visit Us Again");
			System.exit(0);
		}
	}

}
