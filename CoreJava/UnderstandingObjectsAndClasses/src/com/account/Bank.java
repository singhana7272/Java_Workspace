package com.account;

import com.beans.BankOnline;

public class Bank {

	public static void main(String[] args){
		BankOnline piyush=new BankOnline("Piyush",123);
		piyush.deposit(300);
		piyush.deposit(300);
		System.out.println(piyush.checkBalance(1234));
		
	}

}
