package com.vehicle_example;

public class BMW extends Car{
	private String color;
	
	public BMW() {
		super();
	}
	
	public BMW(String color){
		super("Q8",1000);
		this.color=color;
	}
	
	void getFeatures() {
		System.out.println(this.color+" BMW have *****");
	}
    
	void start(){
		System.out.println(super.getModel() + " starts....");
	}
}
