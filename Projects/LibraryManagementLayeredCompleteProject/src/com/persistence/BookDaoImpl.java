package com.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.bean.Book;
import com.bean.BookType;
import com.bean.CustomerCard;

@Repository
public class BookDaoImpl implements BookDao{
	
	private static final String url="jdbc:mysql://localhost:3306/librarydb";
	private static final String user="root";
	private static final String password="admin";

	@Override
	public ArrayList<Book> listOfBookAvailable() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection(url,user,password);
		String query="Select * from books";
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		ResultSet resultSet=preparedStatement.executeQuery();
		ArrayList<Book> books=new ArrayList<>();
		
		while(resultSet.next()) {
			String bookId=resultSet.getString("bookId");
			String bookTypeId=resultSet.getString("bookTypeId");
			String bookName=resultSet.getString("bookName");
			String authorName=resultSet.getString("authorName");
			int noOfCopiesAvailable=resultSet.getInt("numberOfCopiesAvailable");
			Book book=new Book(bookId,bookTypeId,bookName,authorName,noOfCopiesAvailable);
			books.add(book);
		}
	connection.close();	
	return books;
	}

	@Override
	public Book searchBookById(String bookId) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection(url,user,password);
		String query="select * from books";
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		ResultSet resultSet=preparedStatement.executeQuery();
		
		while(resultSet.next()) {
			String bId=resultSet.getString("bookId");
			String bookTypeId=resultSet.getString("bookTypeId");
			String bookName=resultSet.getString("bookName");
			String authorName=resultSet.getString("authorName");
			int numberOfCopiesAvailable=resultSet.getInt("numberOfCopiesAvailable");
			Book book=new Book(bId,bookTypeId,bookName,authorName,numberOfCopiesAvailable);
			if(bId.equals(bookId)) {
				return book;
			}
		}
		return null;
	}

	

	

	

}
