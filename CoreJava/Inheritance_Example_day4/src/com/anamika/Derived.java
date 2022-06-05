package com.anamika;

public class Derived extends Base{
	int i=10;
	
	Derived()
	{
		System.out.println("Derived cos");
	}
	
	void show(){
		System.out.println(super.i);
		System.out.println(i);
	}
}
