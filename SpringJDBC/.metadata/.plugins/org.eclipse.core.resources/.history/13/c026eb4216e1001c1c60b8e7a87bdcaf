package com.client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.presentation.EmployeePresentation;
import com.presentation.EmployeePresentationImpl;

public class EmployeeMain {

	public static void main(String[] args) {
			
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("employee.xml");
		EmployeePresentation employeePresentation=(EmployeePresentation)springContainer.getBean("employeePresentation");
		
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			employeePresentation.showMenu();
			int choice=sc.nextInt();
			employeePresentation.performMenu(choice);
		}

	}
}

