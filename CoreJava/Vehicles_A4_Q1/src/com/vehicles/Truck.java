package com.vehicles;

public class Truck extends Vehicle{

	public Truck(String color, String model, int noofwheels) {
		super(color, model, noofwheels);

	}
	
	public void getDetails(){
		System.out.println("This is Truck");
		System.out.println(super.getModel() +" has "+super.getnoofwheels()+" and is of color "+super.getColor());
	}
	
	public void show(){
		System.out.println("This is a truck");
	}

	@Override
	public String toString() {
		return "Truck [color=" + super.getColor() + ", model=" + super.getModel() + ", noofwheels=" + super.getnoofwheels() + "]";
	}
	
	
}
