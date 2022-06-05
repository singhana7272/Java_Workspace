package com.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Repository;

import com.bean.Book;
import com.bean.CustomerCard;
import com.bean.IssuedBook;

@Repository
public class IssueBookDaoImpl implements IssueBookDao {
	
	private static final String url="jdbc:mysql://localhost:3306/librarydb";
	private static final String user="root";
	private static final String password="admin";

	@Override
	public boolean issueBook(String bookTypeId,String cardId,Book book,String issueDate) throws SQLException, ClassNotFoundException, ParseException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, user, password);
		String query="insert into issuedbook(cardId,bookId,issuedDate,expectedReturnDate) values(?,?,?,?)";
		
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		preparedStatement.setString(1, cardId);
		preparedStatement.setString(2, book.getBookId());
		preparedStatement.setString(3, issueDate);
		Date date=new SimpleDateFormat("yyyy-MM-dd").parse(issueDate);  
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, 7); 
		Date dateWith7Days = cal.getTime();
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String returnDate = formatter.format(dateWith7Days);     
		preparedStatement.setString(4, returnDate);
		int row=preparedStatement.executeUpdate();
		connection.close();
		if(row>1)
			return true;
		else
			return false;
	}

	@Override
	public ArrayList<IssuedBook> listOfBooksIssued(String cardId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean returnBook(String cardId, Date issueDate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateNoOfCopies(String bookId, int noOfCopies) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, user, password);
		String query="Update books set numberOfCopiesAvailable=? where bookId=?";
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		preparedStatement.setInt(1, noOfCopies);
		preparedStatement.setString(2, bookId);
		int rows=preparedStatement.executeUpdate();
		connection.close();
		if(rows>1)
			return true;
		else
			return false;
	}
	
	@Override
	public boolean updateNoOfBooksIssued(CustomerCard customerCard,int noOfBooksIssued) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection(url,user,password);
		String query="update customerCard set noOfBooksIssued=? where cardId=?";
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		preparedStatement.setInt(1, noOfBooksIssued);
		preparedStatement.setString(2,customerCard.getCardId());
		int row=preparedStatement.executeUpdate();
		connection.close();
		if(row>1)
			return true;
		else
			return false;
	
	}

}
