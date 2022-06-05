package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Book;
import com.bean.BookType;
import com.bean.CustomerCard;
import com.persistence.BookDao;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookDao bookDao;

	@Override
	public ArrayList<Book> listOfBookAvailable() throws ClassNotFoundException, SQLException {
		return bookDao.listOfBookAvailable();
	}

	@Override
	public BookType searchBookByType(String bookTypeId) throws ClassNotFoundException, SQLException {
		return bookDao.searchBookByType(bookTypeId);
	}

	@Override
	public Book searchBookById(String bookId) throws ClassNotFoundException, SQLException {
		return bookDao.searchBookById(bookId);
	}



	

}
