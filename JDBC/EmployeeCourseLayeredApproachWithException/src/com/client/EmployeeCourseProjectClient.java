package com.client;

import java.util.*;
import com.beans.Course;
import com.beans.Employee;
import com.exception.InvalidInputException;
import com.presentation.EmployeeCoursePresentation;
import com.presentation.EmployeeCoursePresentationImpl;

public class EmployeeCourseProjectClient {
	public static void main(String[] args) throws InvalidInputException {
		Scanner sc = new Scanner(System.in);

		EmployeeCoursePresentation employeePresentation = new EmployeeCoursePresentationImpl();
		while (true) {
			try {
				employeePresentation.showMenu();
				System.out.println("Enter Choice:");
				char choice = sc.next().charAt(0);
				int ascii = (int) choice;
				if (ascii > 48 && ascii < 54)
					employeePresentation.performMenu(choice);
				else
					throw new InvalidInputException("Warning ! Please enter numbers between 1-5");
			} catch (InvalidInputException exp) {
				System.out.println(exp.getMessage());
			}
			System.out.println();
		}
	}
}
