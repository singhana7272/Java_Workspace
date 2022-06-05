package com.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persistence.IssueBookDao;

@Service
public class ReturnBookServiceImpl implements ReturnBookService{
	@Autowired
	private IssueBookDao issueBookDao;
	@Override
	public boolean returnBook(String cardId, Date issueDate) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
