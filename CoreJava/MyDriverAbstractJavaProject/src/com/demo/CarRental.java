package com.demo;

public class CarRental{
	public static void main(String[] args) {
		Car car1=new Audi();
		car1.setColor("Blue");
		car1.setModel("Audi");
		
		car1.engine();
		
		Car car2=new BMW();
		car2.setColor("Black");
		car2.setModel("BMW");
		
		car2.engine();
		
		Car car3=new Toyota();
		car3.setColor("Silver");
		car3.setModel("Toyota");
		
		car3.engine();
		
		Car car4=new Volvo();
		car4.setColor("Brown");
		car4.setModel("Volvo");
		
		car4.engine();
		
		Driver monu=new Driver();
		monu.setName("monu");
		monu.setCar(car1);
		
		monu.isdriving();
		
		Driver suresh=new Driver();
		suresh.setName("suresh");
		suresh.setCar(car2);
		suresh.isdriving();
	}
	
	
}
