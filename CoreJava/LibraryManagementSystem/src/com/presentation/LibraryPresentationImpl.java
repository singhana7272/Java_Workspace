package com.presentation;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.beans.Book;
import com.beans.Customer;
import com.service.LibraryService;
import com.service.LibraryServiceImpl;

public class LibraryPresentationImpl implements LibraryPresentation{

	Scanner sc=new Scanner(System.in);
	
	LibraryService libraryService=new LibraryServiceImpl();
	
	@Override
	public void showMenu() {
		System.out.println("1.To Issue a Book");
		System.out.println("2.To Return a Book");
		System.out.println("3.List no of Books for a specific customer");
		System.out.println("4.List no of Customers issued same book");
		System.out.println("5.Exit");
	}

	@Override
	public void performMenu(int choice) {
		switch(choice) {
		case 1:
			System.out.println("Enter your cardId");
			int cardId=Integer.parseInt(sc.nextLine());
			Customer customer=libraryService.searchCustomerFromCardId(cardId);
			if(customer!=null){
				System.out.println("Enter the book Id you want to issue");
				String bookId=sc.nextLine();
				Book book=libraryService.searchBookFromBookId(bookId);
				if(book!=null) {

					boolean issueStatus=libraryService.addCustomer(bookId,customer);
					boolean bookAdditionStatus=libraryService.addBook(book,cardId);
					if(issueStatus && bookAdditionStatus)
						System.out.println("Book is Issued and the same added to your card.");
					else
						System.out.println("Sorry, It cant be issued at this time");
			     }
			}
			break;
		
		case 2:
			System.out.println("Please enter your cardId");
			cardId=Integer.parseInt(sc.nextLine());
			customer=libraryService.searchCustomerFromCardId(cardId);
			System.out.println("Please enter Book Id you want to return");
			String bookId=sc.nextLine();
			
			
			long charge=libraryService.calculateLateFee(bookId,customer);
			boolean status=libraryService.removeBook(bookId,customer);
			
			if(status) 			
				System.out.println("Rs."+ charge + " is charged for "+ customer.getCardId() + " cardId");
			else
				System.out.println("Wrong Book Id");
			break;
		
		case 3:
			System.out.println("Enter your cardId");
			cardId =Integer.parseInt(sc.nextLine());
			customer=libraryService.searchCustomerFromCardId(cardId);
			ArrayList<Book> books=libraryService.getAllBooksForSpecificCustomer(customer);
			for(Book book: books) {
				System.out.println(book);
			}
			
			break;
		
		case 4:
			System.out.println("Enter book name");
			bookId=sc.nextLine();
			Book book=libraryService.searchBookFromBookId(bookId);
			ArrayList<Customer> customers=libraryService.getAllCustomersForSpecificBook(book);
			
			for(Customer customerBook: customers) {
				System.out.println(customerBook);
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
