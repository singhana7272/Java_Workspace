package com.client;

import java.util.Scanner;

import com.presentation.LibraryPresentation;
import com.presentation.LibraryPresentationImpl;

public class LibraryManagement {

	public static void main(String[] args) {
		
		LibraryPresentation libraryPresentation=new LibraryPresentationImpl();
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			libraryPresentation.showMenu();
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			libraryPresentation.performMenu(choice);
		}

	}

}
