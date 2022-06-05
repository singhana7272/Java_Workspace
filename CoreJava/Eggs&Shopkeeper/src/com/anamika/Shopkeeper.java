package com.anamika;
import java.util.*;
public class Shopkeeper{
	public static void main(String[] args) {
		int productno;
		int quantitysold;
		System.out.println("Enter productno:");
		Scanner sc=new Scanner(System.in);
		productno=sc.nextInt();
		System.out.println("Enter quantitysold");
		quantitysold=sc.nextInt();
		
		switch(productno) {
		case 1:
			System.out.println(quantitysold*22.50);
			break;
		case 2:	
			System.out.println(quantitysold*44.50);
			break;
		case 3:
			System.out.println(quantitysold*9.98);
			break;
		default:
			System.out.println("Incorrect product no");
			break;
		}
			
	}

}
