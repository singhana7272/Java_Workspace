package com.vehicles;

public class Bus extends Vehicle{
	
	public Bus(String color, String model, int noofwheels) {
		super(color, model, noofwheels);
		
	}
	
	public void getDetails(){
		System.out.println("This is Bus");
		System.out.println(super.getModel() +" has "+super.getnoofwheels()+" and is of color "+super.getColor());
	}
	
	public void isWorking(){
		System.out.println("yes, Bus is working");
	}

	@Override
	public String toString() {
		return "Bus [color=" + super.getColor() + ", model=" + super.getModel() + ", noofwheels=" + super.getnoofwheels() + "]";
	}
	
	
	
	
}
