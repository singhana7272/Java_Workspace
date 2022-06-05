package com.newton;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		int arr[]=new int[n];
		
		for(int x=0;x<n;x++)
			arr[x]=sc.nextInt();
		
		while(d!=0){
			int first=arr[0];
			for(int i=1;i<n;i++) 
				arr[i-1]=arr[i];
			arr[n-1]=first;
			d--;
		}
		
		
		for(int j=0;j<n;j++)
		{
			System.out.print(arr[j]+" ");
		}

	}

}
