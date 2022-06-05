package com.demo;

public class Rectangle implements Shape{
	private double length,breadth,area;

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void area() {
		area=length*breadth;
	}

	@Override
	public void display() {
		System.out.println("Area of the rectangle is "+ area);
	}
		
}
