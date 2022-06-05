package com.vehicle_example;

public class Audi extends Car {
	private final static String COLOR="BLACK";
	
//	public Audi(String model, int price) {
//		super(model, price);
//		// TODO Auto-generated constructor stub
//	}
//	
	
	
	
	void getFeatures() {
		System.out.println(this.COLOR+" Audi have $$$$");
	}
	void start() {
		System.out.println(this.getModel()+" starts....");
	}
	
}
