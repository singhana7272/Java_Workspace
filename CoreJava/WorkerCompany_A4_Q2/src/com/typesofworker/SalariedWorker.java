package com.typesofworker;

public class SalariedWorker extends Worker{
	
	
	public SalariedWorker(String name, int salaryrate, int hours) {
		super(name, salaryrate, hours);
	}

	public int methodPay(int hours){
		System.out.println("This is Salaried Worker");
		super.setHours(hours);
		return (40)*super.getSalaryrate();
	}
}
