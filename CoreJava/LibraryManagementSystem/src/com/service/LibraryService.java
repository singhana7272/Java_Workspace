package com.service;

import java.util.ArrayList;

import com.beans.Book;
import com.beans.Customer;


public interface LibraryService {

	Customer searchCustomerFromCardId(int cardId);
	boolean addCustomer(String bookId,Customer customer);
	Book searchBookFromBookId(String bookId);
	boolean addBook(Book book,int cardId);
	long calculateLateFee(String bookId, Customer customer);
	ArrayList<Book> getAllBooksForSpecificCustomer(Customer customer);
	ArrayList<Customer> getAllCustomersForSpecificBook(Book book);
	boolean removeBook(String bookId, Customer customer); 

}
