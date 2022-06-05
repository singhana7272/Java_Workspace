package com.newton;

import java.util.Scanner;

public class Buildings {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	long arr[]=new long[n];
	
	for(int i=0;i<n;i++)
		arr[i]=sc.nextLong();
	
	long max=arr[0];

	long noOfBuildings=1;
	
	for(int i=1;i<n;i++) {
		if(arr[i]>max) {
			max=arr[i];
			noOfBuildings++;
		}
	}
    
	System.out.println(noOfBuildings);
	}
}
