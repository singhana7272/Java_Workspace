package com.typesofworker;

public class Worker {
	private String name;
	private int salaryrate;//(rs/hr)
	private int hours;
	

	public Worker(String name, int salaryrate,int hours) {
		super();
		this.name = name;
		this.salaryrate = salaryrate;
		this.hours=hours;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getSalaryrate(){
		return this.salaryrate;
	}
	
	public void setHours(int hours){
		this.hours=hours;
	}
	
	public int getHours(){
		return this.hours;
	}
	


	public int methodPay(int hours){
		System.out.println("This is worker");
		return 7*hours*salaryrate;
	}

}
