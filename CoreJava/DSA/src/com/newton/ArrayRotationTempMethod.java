package com.newton;

import java.util.Scanner;

public class ArrayRotationTempMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int d=sc.nextInt();
		int tempArr[]=new int[d];
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		
		for(int i=0;i<d;i++)
			tempArr[i]=arr[i];
		
		for(int i=d;i<n-1;i++)
			arr[i-d]=arr[i];
		
		for(int i=d+1;i<n;i++)
			arr[i]=tempArr[i-(d+1)];
		
		for(int i=0;i<n;i++)
			System.out.println(arr[i]+" ");
	}

}
