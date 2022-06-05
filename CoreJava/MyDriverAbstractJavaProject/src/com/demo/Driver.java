package com.demo;

public class Driver{
	
	private String name;
	private Car car;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
	public void isdriving(){
		System.out.println(this.name +" is driving "+ this.car);
	}

}
