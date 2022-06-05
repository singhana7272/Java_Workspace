package com.demo;

public class CalculateShape {
	private Shape shape;

	public CalculateShape(Shape shape) {
		super();
		this.shape = shape;
	}
	
	public void getArea(){
		shape.area();
		shape.display();
	}
	
	

}
