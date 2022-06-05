package com.persistence;

import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Book;
import com.bean.BookType;
import com.bean.CustomerCard;

public interface BookDao {
	Book searchBookById(String bookId) throws ClassNotFoundException, SQLException;
	ArrayList<Book> listOfBookAvailable() throws ClassNotFoundException, SQLException;
	
	
}
