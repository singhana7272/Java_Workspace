package com.persistence;

import java.sql.SQLException;

import com.bean.Customer;
import com.bean.CustomerCard;

public interface CustomerDao {
	boolean getCustomerById(String customerId) throws ClassNotFoundException, SQLException;
	void CustomerAccountDetails(String customerId,String cardId) throws ClassNotFoundException, SQLException;
    CustomerCard searchCustomerCard(String cardId) throws ClassNotFoundException, SQLException;
	int addNewRecord(Customer customer) throws ClassNotFoundException, SQLException;
}
