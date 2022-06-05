package com.bank;

public interface Interest {
	double interest_percent_savingsacc=10;
	double interest_percent_fixedacc=9;
	double interest_percent_personalloan=0.5;
	double interest_percent_housingloan=0.2;

	double calcInt();
}
