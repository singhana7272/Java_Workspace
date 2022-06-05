package com.persistence;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import com.bean.Book;
import com.bean.CustomerCard;
import com.bean.IssuedBook;

public interface IssueBookDao {
	boolean issueBook(String bookTypeId,String cardId,Book book,String issueDate) throws SQLException, ClassNotFoundException, ParseException;
	boolean updateNoOfCopies(String bookId,int noOfCopies) throws ClassNotFoundException, SQLException;
	ArrayList<IssuedBook> listOfBooksIssued(String cardId);
	boolean returnBook(String cardId,Date issueDate);
	boolean updateNoOfBooksIssued(CustomerCard customerCard,int noOfBooksIssued) throws ClassNotFoundException, SQLException;
}
