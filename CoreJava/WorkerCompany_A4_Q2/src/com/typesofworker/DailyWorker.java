package com.typesofworker;

public class DailyWorker extends Worker{
	int noofdays;
	
	public DailyWorker(String name, int salaryrate, int hours,int noofdays) {
		super(name, salaryrate, hours);
		this.noofdays=noofdays;
	}

	public int methodPay(int hours){
		System.out.println("This is DailyWorker");
		super.setHours(hours);
		return super.getHours()*noofdays*super.getSalaryrate();
	}

}
