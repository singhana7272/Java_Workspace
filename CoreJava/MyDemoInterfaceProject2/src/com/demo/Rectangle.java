package com.demo;

public class Rectangle extends Input implements Dummy,RoundedShape,Shape{
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

	@Override
	public int demonstration() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void circumference(){
		setValue(length);
		double a=getValue();
		setValue(breadth);
		double b=getValue();
		System.out.println("Circumference of rectangle is "+(2*(a+b)));
	}

	@Override
	public void someDummy() {
		// TODO Auto-generated method stub
		System.out.println("I am a dummy");
	}
	
	
	
}
