package com.newton;

import java.util.Scanner;

public class MohitAndArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n-1];
		int sumArray=0;
		for(int i=0;i<(n-1);i++) {
			arr[i]=sc.nextInt();
		    sumArray+=arr[i];
		}
		
		int sumN=(n*(n+1))/2;
		
		System.out.println(sumN-sumArray);
	}

}
