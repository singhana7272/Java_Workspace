package com.newton;

import java.util.Scanner;

public class StrangeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int i=0;
	    while(true) {
			if(strangeNo(i)==i) {
				count++;
				if(count==n) {
					System.out.println(strangeNo(i));
					break;
				}
			}
			i++;
	    }	
		
		 
	}
		public static int strangeNo(int x){
			int sum=0;
			int k=x;
		    while(x>0){
			int a=x%10;
			sum+=a;
			x=x/10;
		    }

		    if(sum%9==0) return k;
			else return -1;
		}
}	
