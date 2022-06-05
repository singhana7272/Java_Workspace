package com.demo;

public class Car extends Vehicle{
	private int price;

	public Car(String model, String brand, int price) {
		super(model, brand);
		this.price = price;
	}

	@Override
	public void run() {
		System.out.println("Car is running");
	}

	public int getPrice() {
		return price;
	}

	
	
}
