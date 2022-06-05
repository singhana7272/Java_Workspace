package com.service;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import com.beans.Book;
import com.beans.Customer;
import com.database.BooksDatabase;
import com.database.CustomerDatabase;

public class LibraryServiceImpl implements LibraryService{

	CustomerDatabase customerDatabase=new CustomerDatabase();
	BooksDatabase booksDatabase=new BooksDatabase();

	@Override
	public Customer searchCustomerFromCardId(int cardId) {
	ArrayList<Customer> customers= customerDatabase.getCustomers();
		for(Customer customer : customers) {
			if(customer.getCardId()==cardId) {
				return customer;
			}
		}
		System.out.println("Sorry ! you are not registered");
		return null;
	}

	@Override
	public boolean addCustomer(String bookId, Customer customer) {
		ArrayList<Book> books=booksDatabase.getBooks();
		
		for(Book book : books) {
			if(book.getBookId().equals(bookId)) {
				ArrayList<Customer> customers=book.getCustomers();
				customers.add(customer);
				return true;
			}
		}
		return false;
	}

	@Override
	public Book searchBookFromBookId(String bookId) {
		ArrayList<Book> books=booksDatabase.getBooks();
		for(Book book : books) {
			if(book.getBookId().equalsIgnoreCase(bookId)) {
				return book;
			}
		}
		System.out.println("Sorry! This book is not available");
		return null;
	}

	@Override
	public boolean addBook(Book book,int cardId) {
		ArrayList<Customer> customers=customerDatabase.getCustomers();
		for(Customer customer : customers) {
			if(customer.getCardId()==cardId) {
				ArrayList<Book> books=customer.getBooks();
				books.add(book);
				return true;
			}
		}
		return false;
	}	
	
	@Override
	public long calculateLateFee(String bookId, Customer customer) {
		Date currentDate=new Date();
		ArrayList<Customer> customers=customerDatabase.getCustomers();
		if(customers.contains(customer)) {
		ArrayList<Book> books=customer.getBooks();
		for(Book book : books) {
			if(book.getBookId().equals(bookId)) {
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					Date issueDate;
					try {
						issueDate = sdf.parse(customer.getBookIssueDate());
						long difference_In_Time=  currentDate.getTime() - issueDate.getTime();
						long difference_In_Days = (difference_In_Time / (1000 * 60 * 60 * 24)) % 365;
						if(difference_In_Days>7) {
							return book.getLateFeeRate()*difference_In_Days;
						}
						else {
							System.out.println("No charge for you!");
						}
					} catch (ParseException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return 0;
	}

	@Override
	public ArrayList<Book> getAllBooksForSpecificCustomer(Customer cust) {
		return cust.getBooks();
	}

	@Override
	public ArrayList<Customer> getAllCustomersForSpecificBook(Book book) {
		return book.getCustomers();
	}

	@Override
	public boolean removeBook(String bookId, Customer customer) {
		ArrayList<Customer> customers=customerDatabase.getCustomers();
		if(customers.contains(customer)) {
			ArrayList<Book> books=customer.getBooks();
			for(Book book : books) {
				if(book.getBookId().equals(bookId)) {
					book.getCustomers().remove(customer);
					books.remove(book);
					return true;
				}
			}
		}
		return false;
	}
	
}
