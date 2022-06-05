package com.newton;

import java.util.Scanner;

public class SimpleShopping {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		
		if(n<=200)
			System.out.println(200-n);
		else if(n<=400)
			System.out.println(400-n);
		else if(n<=500)
			System.out.println(500-n);
		else
			System.out.println((100-(n%100))%100);
	}

}
