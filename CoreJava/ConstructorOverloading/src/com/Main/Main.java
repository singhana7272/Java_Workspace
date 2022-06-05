package com.Main;

import com.beans.Employee;

public class Main {

	public static void main(String[] args) {
		Employee anamika=new Employee("Anamika");
		Employee koumudi=new Employee("koumudi",11);
		Employee chandani=new Employee("chandani",22,23);
		Employee varsha=new Employee("varsha",33,"ASE");
		Employee kunjan=new Employee("kunjan",44,23,"ASE");
		Employee poonam=new Employee("poonam",55,27,"pune");
		Employee puja=new Employee("puja",66,25,2);
		Employee shikha=new Employee("shikha",77,"ASE",1);
		Employee sukanya=new Employee("sukanya",88,"TL","pune",7);
		Employee madhuri=new Employee("madhuri",99,32,"manager","pune",8);
		
		System.out.println(anamika.toString());
		System.out.println(koumudi.toString());
		System.out.println(chandani.toString());
		System.out.println(varsha.toString());
		System.out.println(kunjan.toString());
		System.out.println(poonam.toString());
		System.out.println(puja.toString());
		System.out.println(shikha.toString());
		System.out.println(sukanya.toString());
		System.out.println(madhuri.toString());
	}

}
