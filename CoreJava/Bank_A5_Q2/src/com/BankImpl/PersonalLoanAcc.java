package com.BankImpl;

import com.bank.DebitInterest;
import com.bank.LoanAcc;

public class PersonalLoanAcc extends Input implements LoanAcc,DebitInterest{

private int balance,repay,partialprincipal;
	
	public PersonalLoanAcc(int balance, int repay, int partialprincipal) {
		super();
		this.balance = balance;
		this.repay = repay;
		this.partialprincipal = partialprincipal;
	}

	@Override
	public void createAcc(){	
		System.out.println(personalLoantype + "is created with opening balance "+balance);
	}

	@Override
	public double calcInt() {
		return balance*interest_percent_personalloan;
	}

	@Override
	public void deductMonthlyInt() {
		setValue(12);
		balance-=(calcInt()/getValue());
		System.out.println("Amount after deducting Monthly Interest "+balance);
	}

	@Override
	public void deductHalfYrlyInt() {
		setValue(6);
		balance-=(calcInt()/getValue());
		System.out.println("Amount after deducting the Half Yearly Interest "+balance);
	}

	@Override
	public void deductAnnualInt() {
		balance-=calcInt();
		System.out.println("Amount after deducting the Annual Interest "+balance);
	}

	@Override
	public void repayPrincipal() {
		balance+=repay;
		System.out.println("Amount after repaying principal "+balance);
	}

	@Override
	public void payInterest() {
		balance+=calcInt();
		System.out.println("Amount after paying interest "+balance);
	}

	@Override
	public void payPartialPrincipal() {
		balance+=partialprincipal;
		System.out.println("Amount after paying partial principal "+balance);
	}

}
