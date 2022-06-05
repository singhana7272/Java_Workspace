package com.demo;

public class MathFun {
	
//	private int a;
//	private int b;
	
	int add(int a,int b){
		System.out.println("add integer");
		return a+b;
	}
	
	double add(double a,double b){
		System.out.println("add double");
		return a+b;
	}
	
//	int add(double a,double b){
//		System.out.println("add double");
//		return (int)a+(int)b;
//	}
	//method overloading does not differs on basis of return type.
//	double add(double a,double b){
//		System.out.println("add double");
//		return a+b;
//	}
	
	int add(int a,int b,int c){
		return a+b+c;
	}
	
	int add(int a){
		return a;
	}
	

}
