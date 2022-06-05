package com.database;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import com.beans.Book;
import com.beans.Customer;

import lombok.Getter;
import lombok.Setter;

public class CustomerDatabase {
	
	@Getter
	@Setter
	static ArrayList<Customer> customers=new ArrayList<>();
	
	static {
		customers.add(new Customer(101,"Kevin","Management","03/03/2022",new ArrayList<Book>()));
		customers.add(new Customer(102,"Josh","Technology","10/03/2022",new ArrayList<Book>()));
		customers.add(new Customer(103,"Sara","Technology","04/03/2022",new ArrayList<Book>()));
		customers.add(new Customer(104,"George","Data Analytics","05/03/2022",new ArrayList<Book>()));
		customers.add(new Customer(105,"Peter","Management","06/03/2022",new ArrayList<Book>()));
	}
}
