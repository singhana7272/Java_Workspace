package com.vehicles;

public class Car extends Vehicle{
    	public Car(String color, String model, int noofwheels) {
		super(color, model, noofwheels);
	}
	
	public void getDetails(){
		System.out.println("This is car");
		System.out.println(super.getModel() +" has "+ super.getnoofwheels() +" and is of color "+super.getColor());
	}
	
	public void identifyBrand(){
		if((super.getModel()).equals("AUDI") || (super.getModel()).equals("BMW")){
			System.out.println("Good Brand");
		}
		else System.out.println("Normal Brand");
	}

	@Override
	public String toString() {
		return "Car [color=" + super.getColor() + ", model=" + super.getModel() + ", noofwheels=" + super.getnoofwheels() + "]";
	}
	
	

}
