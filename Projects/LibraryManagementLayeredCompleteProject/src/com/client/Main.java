package com.client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.presentation.LoginPresentation;

public class Main {
	public static void main(String[] args) {
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("login.xml");
		LoginPresentation loginPresentation=(LoginPresentation)springContainer.getBean("loginPresentationImpl");
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			loginPresentation.showMenu();
			System.out.println("Enter your choice");
			int choice=Integer.parseInt(sc.nextLine());
			loginPresentation.performMenu(choice);
		}
		
	}
}
