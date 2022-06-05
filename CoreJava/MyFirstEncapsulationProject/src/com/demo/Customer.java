package com.demo;

public class Customer{
	private String name;
	private String userId;
	private String pin;
	private double balance;
	
	public Customer(String name, String userId, String pin, double balance) {
		super();
		this.name = name;
		this.userId = userId;
		this.pin = pin;
		this.balance = balance;
	}
	
	public void deposit(double balance){
		this.balance+=balance;
	}
	
	public void getbalance(String userId,String pin){
		if(userId.equals(this.userId) && pin.equals(this.pin))
			System.out.println("Balance is :"+balance);
		else
			System.out.println("Invalid credentials");
	}

	public String getName(String userId,String pin) {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void changename(String userId,String pin,String name){
		if(userId.equals(this.userId) && pin.equals(this.pin)){
			setName(name);
            System.out.println("Name has been updated");
		}
		else
			System.out.println("Invalid credentials");
	}
	

}
