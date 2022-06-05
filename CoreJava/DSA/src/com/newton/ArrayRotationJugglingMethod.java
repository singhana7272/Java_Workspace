package com.newton;

import java.util.Scanner;

public class ArrayRotationJugglingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int d=sc.nextInt();
		
		d=d%n;
		int gcd=gcd(n,d);
		for(int i=0;i<gcd;i++) {
			int temp=arr[i];
			int j=i;
			while(true){
				int k=j+d;
				if(k>=n) k=k-n;
				if(k==i) break;
				arr[j]=arr[k];
				j=k;
			}
			arr[j]=temp;
		}
		
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static int gcd(int n1,int n2) {
		if(n2==0) return n1;
		else
			return gcd(n2,n1%n2);
	}

}
