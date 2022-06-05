package com.newton;

import java.util.*;
public class NumberOfDays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		numberofdays(m);
	}
	
	public static void numberofdays(int M) {
		if(M<=7) {
			if(M==2) 
				System.out.println("28");
			else {
			if(M%2==0) 
				System.out.println("30");
			else 
				System.out.println("31");
			}
		}
		else {
			if(M%2==0)
				System.out.println("31");
			else
				System.out.println("30");
		}
	}
}
