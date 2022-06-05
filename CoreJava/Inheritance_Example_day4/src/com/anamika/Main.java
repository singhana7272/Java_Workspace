package com.anamika;

public class Main{
	public static void main(String[] args) {
		Base base=new Base();
		base.show();
		System.out.println(base.i);
		
		System.out.println("-------------");
		
		Derived d=new Derived();
		d.show();
		
		System.out.println("--------------");
		Base b=new Derived();
		b.show();
		
		System.out.println(b.i);
		
		
	}

}
