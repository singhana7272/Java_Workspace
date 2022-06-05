package com.demo;

public class MainCalculateShape {
	public static void main(String[] args) {
		Circle shape1=new Circle(8);
		CalculateShape circle=new CalculateShape(shape1);
		circle.getArea();
		shape1.circumference();
		System.out.println(shape1.demonstration());
		shape1.someDummy();
		
		Rectangle shape2=new Rectangle(8,7);
		CalculateShape rectangle=new CalculateShape(shape2);
		rectangle.getArea();
		shape2.circumference();
		System.out.println(shape2.demonstration());
		shape2.someDummy();
		
	}

}
