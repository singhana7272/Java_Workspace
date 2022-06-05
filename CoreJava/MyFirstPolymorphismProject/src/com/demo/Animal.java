package com.demo;

public class Animal {
	
	private String color;
	int weight;
	
	
	
	public Animal(String color, int weight) {
		System.out.println("Animal contructor Called");
		this.color = color;
		this.weight = weight;
	}

	void getDetails() {
		System.out.println("Animal color is "+color+" and of "+weight+" Kg");
	}
	
	void eat() {
		System.out.println("Animal is eating");
	}

}
