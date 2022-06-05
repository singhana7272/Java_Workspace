package com.newton;

import java.util.Scanner;

class PalindromeString {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
	int n=str.length();
	for(int i=0;i<=(n/2);i++)
	    if(str.charAt(i)!=str.charAt((n-1)-i)) {
		    System.out.print("0");
			break;}
		else {
	        if(i==(n/2)) System.out.print("1");}	
	}
}