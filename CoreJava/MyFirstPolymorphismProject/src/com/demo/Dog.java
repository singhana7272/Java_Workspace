package com.demo;

public class Dog extends Animal {
	
	int weight;
	private String breed;
	
	
	public Dog(String color, int weight, String breed) {
		super(color, weight);
		this.breed = breed;
		this.weight=weight-5;
		System.out.println("Dog Constructor Called");
	}
	
	@Override
	void getDetails() {
		System.out.println("Dog breed: "+breed);
	}

}
