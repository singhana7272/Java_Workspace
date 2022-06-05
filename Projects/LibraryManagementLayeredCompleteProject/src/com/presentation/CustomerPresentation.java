package com.presentation;

import java.sql.SQLException;

public interface CustomerPresentation {
	void showLoginMenu();
	void performLoginMenu(int choice,String cardId) throws ClassNotFoundException, SQLException;
}
