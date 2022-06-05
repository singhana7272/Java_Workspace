package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Customer;
import com.bean.CustomerCard;
import com.persistence.CustomerDao;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public boolean getCustomerById(String customerId) throws ClassNotFoundException, SQLException {
		return customerDao.getCustomerById(customerId);
	}

	@Override
	public void CustomerAccountDetails(String customerId, String cardId) throws ClassNotFoundException, SQLException {
		customerDao.CustomerAccountDetails(customerId, cardId);
	}


	@Override
	public CustomerCard searchCustomerCard(String cardId) throws ClassNotFoundException, SQLException {
		return customerDao.searchCustomerCard(cardId);
	}

	@Override
	public int addNewCustomer(Customer customer) throws ClassNotFoundException, SQLException {
		int customerId=customerDao.addNewRecord(customer);
		if(customerId > 0)
			return customerId;
		return 0;
	}

	

}
