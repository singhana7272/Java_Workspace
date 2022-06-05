package com.demo;



public class Main {
	
	static int j=5;
	int i=7;
	static {
		System.out.println("static block");
		System.out.println(j);
		
	}
	
	
	{
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("main");
	}

}
