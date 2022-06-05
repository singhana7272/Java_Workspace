package com.demo;

public class Main {
	public static void main(String[] args) {
		Vehicle veh=new Car("Q3","Audi",100000);
		
		System.out.println(veh.getDetails());
		veh.run();
		
		
	}

}
