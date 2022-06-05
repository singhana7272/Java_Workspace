package com.service;

import java.util.Date;

public interface ReturnBookService {
	boolean returnBook(String cardId,Date issueDate);
}
