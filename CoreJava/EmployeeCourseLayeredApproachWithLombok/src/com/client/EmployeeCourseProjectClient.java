package com.client;
import java.util.*;
import com.beans.Course;
import com.beans.Employee;
import com.presentation.EmployeeCoursePresentation;
import com.presentation.EmployeeCoursePresentationImpl;

public class EmployeeCourseProjectClient{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        
		EmployeeCoursePresentation employeePresentation= new EmployeeCoursePresentationImpl();
		
		while(true) {
			employeePresentation.showMenu();
			System.out.println("Enter Choice:");
			int choice=sc.nextInt();
			employeePresentation.performMenu(choice);	
		}	
		
	}
}
