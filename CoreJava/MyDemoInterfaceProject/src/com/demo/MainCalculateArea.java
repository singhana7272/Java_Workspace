package com.demo;

public class MainCalculateArea {
	public static void main(String[] args) {
		Shape shape1=new Circle(7);
		CalculateShape circlearea=new CalculateShape(shape1);
		circlearea.getArea();
		
		Shape shape2=new Rectangle(6,4);
		CalculateShape rectarea=new CalculateShape(shape2);
		rectarea.getArea();
		
	}

}
