package com.beans;

public class BankOnline {
	public String username;
	private int balance;
	private int password;
	
	public BankOnline(String username, int password) {
		this.username = username;
		this.password = password;
	}
	
	
	public boolean deposit(int balance){
		this.balance+=balance;
		return true;
	}
	
	public int checkBalance(int password) {
		if(this.password==password) {
			return balance;
		}
		else return -1; 
	}

}
