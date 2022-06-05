package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Customer;
import com.bean.CustomerCard;

public interface CustomerService {
	int addNewCustomer(Customer customer) throws ClassNotFoundException, SQLException;
	boolean getCustomerById(String customerId) throws ClassNotFoundException, SQLException;
	void CustomerAccountDetails(String customerId,String cardId) throws ClassNotFoundException, SQLException;
    CustomerCard searchCustomerCard(String cardId) throws ClassNotFoundException, SQLException;
}
