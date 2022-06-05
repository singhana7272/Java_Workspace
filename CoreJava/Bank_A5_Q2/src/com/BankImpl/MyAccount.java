package com.BankImpl;


public class MyAccount {

	public static void main(String[] args) {
//		FDAcc fixedacc=new FDAcc(100000,700,8000);
//		fixedacc.createAcc();
//		System.out.println(fixedacc.calcint());
//		fixedacc.addAnnualInt();
//		fixedacc.addHalfYrlyInt();
//		fixedacc.addMonthlyInt();
//		fixedacc.withdraw();
//		fixedacc.deposit();
//		fixedacc.getBalance();
		
//		SavingsAcc savingsacc=new SavingsAcc(200000,500,5000);
//		savingsacc.createAcc();
//		System.out.println(savingsacc.calcInt());
//		savingsacc.addAnnualInt();
//		savingsacc.addMonthlyInt();
//		savingsacc.addHalfYrlyInt();
//		savingsacc.withdraw();
//		savingsacc.deposit();
//		savingsacc.getBalance();
		
//		HousingLoanAcc housing=new HousingLoanAcc(2000000,5000,80000);
//		housing.createAcc();
//		System.out.println(housing.calcInt());
//		housing.deductAnnualInt();
//		housing.deductHalfYrlyInt();
//		housing.deductMonthlyInt();
//		housing.repayPrincipal();
//		housing.payInterest();
//		housing.payPartialPrincipal();
		
		PersonalLoanAcc personal=new PersonalLoanAcc(300000,800,5000);
		personal.createAcc();
		System.out.println(personal.calcInt());
		personal.deductAnnualInt();
		personal.deductHalfYrlyInt();
		personal.deductMonthlyInt();
		personal.repayPrincipal();
		personal.payInterest();
		personal.payPartialPrincipal();
	}

}
