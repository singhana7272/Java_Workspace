package com.bank;

public interface LoanAcc extends Account{
	void repayPrincipal();
	void payInterest();
	void payPartialPrincipal();
}
