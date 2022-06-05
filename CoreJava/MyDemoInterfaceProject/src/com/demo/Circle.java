package com.demo;

public class Circle implements Shape{
	private double radius,area;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void area() {
		area=3.14*radius*radius;
	}

	@Override
	public void display() {
		System.out.println("Area of the Circle is "+ area);
	}
	
	

}
