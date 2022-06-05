package com.service;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import com.bean.Book;
import com.bean.CustomerCard;
import com.bean.IssuedBook;

public interface IssueBookService {
	boolean issueBook(String bookTypeId,String cardId,Book book,String issueDate) throws ClassNotFoundException, SQLException, ParseException;
	ArrayList<IssuedBook> listOfBooksIssued(String cardId);
	boolean updateNoOfCopies(String bookId,int noOfCopies) throws ClassNotFoundException, SQLException;
	boolean updateNoOfBooksIssued(CustomerCard customerCard,int noOfBooksIssued) throws ClassNotFoundException, SQLException;
}
