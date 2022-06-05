package com.demo;

public class Circle extends Input implements RoundedShape,Dummy,Shape{
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

	@Override
	public int demonstration() {
		return 0;
	}

	@Override
	public void someDummy() {
		System.out.println("I am dummy");
	}

	@Override
	public void circumference() {
		setValue(radius);
		System.out.println(2*PI*getValue());
		
	}
	
	

}
