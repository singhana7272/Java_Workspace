package com.newton;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class UniqueElementSumMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		int sumArray=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
	        sumArray+=arr[i];
		}     
		
		Set<Integer> s=new HashSet<Integer>();
		
		for(int i=0;i<n;i++) {
			s.add(arr[i]);
		}
		
		int sumSet=0;
		for(Integer ele: s) {
			sumSet+=ele;
		}
		
		System.out.println("Unique Element = "+ (sumArray-sumSet));
	}
}
