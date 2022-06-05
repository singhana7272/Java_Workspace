package com.demo;

public class Cat extends Animal {
	
	private String breed;
	
	
	
	public Cat(String color, int weight, String breed) {
		super(color, weight);
		this.breed = breed;
	}

	void getDetails() {
		super.getDetails();
		System.out.println("Cat breed: "+breed);
	}
	
	void eat() {
		System.out.println("Cat is eating");
	}

}
