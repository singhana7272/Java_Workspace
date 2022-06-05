package com.newton;

import java.util.*;

public class ArmstrongNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		for(int i=1;i<=n;i++){
		armstrong(i);
		}
	}
	
	public static void armstrong(int n) {
		int k=n,s=0;
		while(n>0)
		{
			int a=n%10;
			s+=(a*a*a);
			n=n/10;
		}
		
		if(s==k)
			System.out.print(k+" ");

	}
}
