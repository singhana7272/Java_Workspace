package com.BankImpl;

import com.bank.CreditInterest;
import com.bank.DepositAcc;

class FDAcc extends Input implements DepositAcc,CreditInterest{
	private int balance,withdraw,deposit;

	public FDAcc(int balance, int withdraw, int deposit) {
		this.balance = balance;
		this.withdraw = withdraw;
		this.deposit = deposit;
	}

	@Override
	public void createAcc() {
		System.out.println(fixedtype +" opened with current balance "+balance);;
	}

	@Override
	public double calcInt() {
		return balance*interest_percent_savingsacc;	
	}
   
	@Override
	public void addMonthlyInt() {
		setValue(12);
		balance+=(calcInt()/getValue());
		System.out.println("Amount after adding Monthly Interest : "+balance);
	}

	@Override
	public void addHalfYrlyInt() {
		setValue(6);
		balance+=(calcInt()/getValue());
		System.out.println("Amount after adding Half Yearly Interest : "+balance);
	}

	@Override
	public void addAnnualInt() {
		balance+=(calcInt());
		System.out.println("Amount after adding annual interest : "+balance);
	}

	@Override
	public void withdraw() {
		balance-=withdraw;
		System.out.println("Amount left after withdrawing money : "+balance);
	}

	@Override
	public void deposit() {
		balance+=deposit;
		System.out.println("Amount after depositing the money : "+balance);
	}

	@Override
	public void getBalance() {
		System.out.println("Final Balance : "+balance);
	}
    
}
