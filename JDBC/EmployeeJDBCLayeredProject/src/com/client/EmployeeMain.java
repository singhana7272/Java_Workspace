package com.client;

import java.util.Scanner;

import com.presentation.EmployeePresentation;
import com.presentation.EmployeePresentationImpl;

public class EmployeeMain {

	public static void main(String[] args) {
		
		EmployeePresentation employeePresentation=new EmployeePresentationImpl();
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			employeePresentation.showMenu();
			int choice=sc.nextInt();
			employeePresentation.performMenu(choice);
		}

	}
}
