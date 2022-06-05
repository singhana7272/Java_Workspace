package com.demo;

public class Vehicle implements MyDemoInterface,MySecondInterface{
	private String model;
	private String brand;
	
	public Vehicle(String model, String brand) {
		super();
		this.model = model;
		this.brand = brand;
	}

	@Override
	public String getdetails() {
		return this.model+" "+this.brand;
	}

	@Override
	public void run() {
		System.out.println("Car is running");
	}

	@Override
	public String getBrand() {
		return this.brand;
	}
	
	
		

}
