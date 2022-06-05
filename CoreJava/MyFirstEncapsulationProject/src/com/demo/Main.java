package com.demo;

public class Main {

	public static void main(String[] args) {
		Customer cus=new Customer("Anamika","12345","000",200);
		cus.getbalance("12345","000");
		cus.changename("12345", "000","Preeti");
        System.out.println(cus.getName("12345", "000"));
	}

}
