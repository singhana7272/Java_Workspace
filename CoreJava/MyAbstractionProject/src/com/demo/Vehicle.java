package com.demo;

abstract public class Vehicle{
	private String model;
	private String brand;
	
	public Vehicle(String model, String brand) {
		super();
		this.model = model;
		this.brand = brand;
	}
	
	abstract public void run();
	
	public String getDetails(){
		return "Vehicle [model=" + model + ", brand=" + brand + "]";
	}
		

}
