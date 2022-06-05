package com.vehicles;

public class Vehicle {
	private String color;
	private String model;
	private int noofwheels;
	
	public String getColor(){
		return this.color;
	}
	
	public String getModel(){
		return this.model;
	}
	
	public int getnoofwheels(){
		return this.noofwheels;
	}
	
	public Vehicle(String color, String model, int noofwheels) {
		super();
		this.color = color;
		this.model = model;
		this.noofwheels = noofwheels;
	}
	
	public void getDetails(){
		System.out.println("This is vehicle");
		System.out.println(this.model +" has "+this.noofwheels+" and is of color "+this.color);
	}

	@Override
	public String toString() {
		return "Vehicle [color=" + color + ", model=" + model + ", noofwheels=" + noofwheels + "]";
	}
	
	
}
