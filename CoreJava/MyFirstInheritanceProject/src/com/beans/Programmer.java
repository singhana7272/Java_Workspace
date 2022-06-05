package com.beans;

public class Programmer extends Employee {
    int bonus=100000;
    
    public static void main(String args[]) {
    	Programmer p=new Programmer();
    	
    	System.out.println("This is employee salary = "+ p.salary);
    	System.out.println("This is programmer's bonus =" +p.bonus);
    }
    

}

