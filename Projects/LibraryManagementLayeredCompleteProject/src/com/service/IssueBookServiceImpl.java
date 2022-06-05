package com.service;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Book;
import com.bean.CustomerCard;
import com.bean.IssuedBook;
import com.persistence.IssueBookDao;

@Service
public class IssueBookServiceImpl implements IssueBookService {
	
	@Autowired
	private IssueBookDao issueBookDao;

	@Override
	public ArrayList<IssuedBook> listOfBooksIssued(String cardId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean issueBook(String bookTypeId, String bookId,Book book,String issueDate) throws ClassNotFoundException, SQLException, ParseException {
		return issueBookDao.issueBook(bookTypeId, bookId,book, issueDate);
	}

	@Override
	public boolean updateNoOfCopies(String bookId, int noOfCopies) throws ClassNotFoundException, SQLException {
		return issueBookDao.updateNoOfCopies(bookId, noOfCopies);
	}

	@Override
	public boolean updateNoOfBooksIssued(CustomerCard customerCard,int noOfBooksIssued) throws ClassNotFoundException, SQLException {
		return issueBookDao.updateNoOfBooksIssued(customerCard, noOfBooksIssued);
	}

}
