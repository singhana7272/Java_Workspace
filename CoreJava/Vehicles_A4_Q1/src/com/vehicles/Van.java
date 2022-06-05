package com.vehicles;

public class Van extends Vehicle{

	
	public Van(String color, String model, int noofwheels) {
		super(color, model, noofwheels);
	
	}
	
	public void getDetails(String color,String model,int noofwheels){
		System.out.println("This is van");
		System.out.println(super.getModel() +" has "+super.getnoofwheels()+" and is of color "+super.getColor());
	}
	
	public void showModel(){
		System.out.println("this is of model "+super.getModel());
	}

	@Override
	public String toString() {
		return "Van [color=" + super.getColor() + ", model=" + super.getModel() + ", noofwheels=" + super.getnoofwheels() + "]";
	}
	
    
}
