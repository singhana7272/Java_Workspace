package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Book;
import com.bean.BookType;
import com.bean.CustomerCard;

public interface BookService {
	BookType searchBookByType(String bookTypeId) throws ClassNotFoundException, SQLException;
	Book searchBookById(String bookId) throws ClassNotFoundException, SQLException;
	ArrayList<Book> listOfBookAvailable() throws ClassNotFoundException, SQLException;
}
