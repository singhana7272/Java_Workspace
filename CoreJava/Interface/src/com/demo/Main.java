package com.demo;

public class Main {
	public static void main(String[] args) {
		Vehicle veh = new Vehicle("Q3","AUDI");
		veh.run();
		System.out.println(veh.getdetails());
		System.out.println(veh.getBrand());
		
	}
}
