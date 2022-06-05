package com.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.bean.Customer;
import com.bean.CustomerCard;


@Repository
public class CustomerDaoImpl implements CustomerDao {

	private static final String url = "jdbc:mysql://localhost:3306/librarydb";
	private static final String user = "root";
	private static final String password = "admin";

	@Override
	public boolean getCustomerById(String customerId) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, user, password);
		String query = "Select * from customers where customerId=?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, customerId);
		ResultSet resultSet = preparedStatement.executeQuery();
		ArrayList<Customer> customers = new ArrayList<>();
		Customer customer = null;
		while (resultSet.next()) {
			int cId = resultSet.getInt("customerId");
			String customerName = resultSet.getString("customerName");
			String collegeName = resultSet.getString("collegeName");
			String address = resultSet.getString("address");
			customer = new Customer(cId, customerName, collegeName, address);
			customers.add(customer);
		}
		connection.close();
		if (customers.contains(customer))
			return true;
		return false;

	}


	@Override
	public void CustomerAccountDetails(String customerId, String cardId) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, user, password);
		String query = "select c.*,cc.cardId,cc.noOfBooksIssued from customers c join customercard cc ON c.customerID=cc.customerId where cc.cardId=? and c.customerId=?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, cardId);
		preparedStatement.setString(2, customerId);
		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			String custId = resultSet.getString("customerId");
			String customerName = resultSet.getString("customerName");
			String collegeName = resultSet.getString("CollegeName");
			String address = resultSet.getString("address");
			String cId = resultSet.getString("cardId");
			int noOfBooksIssued = resultSet.getInt("noOfBooksIssued");
			System.out.println("Customer Id:" + custId);
			System.out.println("Customer Name:" + customerName);
			System.out.println("College Name:" + collegeName);
			System.out.println("Address:" + address);
			System.out.println("cId:" + cId);
			System.out.println("noOfBooksIssued:" + noOfBooksIssued);
		}
		connection.close();
	}
	
	@Override
	public CustomerCard searchCustomerCard(String cardId) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection(url,user,password);
		String query="select * from customercard where cardId=?";
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		preparedStatement.setString(1, cardId);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		while(resultSet.next()) {
			String cId=resultSet.getString("cardId");
			String customerId=resultSet.getString("customerId");
			int noOfBooksIssued=resultSet.getInt("noOfBooksIssued");
//			CustomerCard customerCard=new CustomerCard(cardId, customerId, noOfBooksIssued);
			connection.close();
//			return customerCard;
		}
		return null;
	}

	@Override
	public int addNewRecord(Customer customer)throws ClassNotFoundException, SQLException  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection(url,user,password);
		String query="INSERT INTO CUSTOMERS(CUSTOMERNAME,COLLEGENAME,ADDRESS)"
				+ "VALUES(?,?,?)";
		PreparedStatement preparedStatement=connection.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
		preparedStatement.setString(1, customer.getCustomerName());
		preparedStatement.setString(2, customer.getCollegeName());
		preparedStatement.setString(3, customer.getAddress());
		int result = preparedStatement.executeUpdate();
		ResultSet rs = preparedStatement.getGeneratedKeys();
		int id=0;
		while (rs.next()) {
			 id = rs.getInt(1);    
			 System.out.println("automatically generated key value = " + id);
			}
		return id;
	}

}
