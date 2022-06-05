package com.database;

import com.beans.Customer;

import java.util.ArrayList;

import com.beans.Book;

import lombok.Getter;
import lombok.Setter;

public class BooksDatabase {
	@Getter
	@Setter
	static ArrayList<Book> books=new ArrayList<>();
	
	static {
		books.add(new Book("Data Analytics","D01",new ArrayList<Customer>(),5));
		books.add(new Book("Technology","T01",new ArrayList<Customer>(),6));
		books.add(new Book("Management","M01",new ArrayList<Customer>(),7));;
	}
}
