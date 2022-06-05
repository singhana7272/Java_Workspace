package com.newton;

import java.util.Scanner;

public class UniqueElementMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			int count=1;
			for(int j=0;j<n;j++) {
				if(arr[i]==arr[j] && i!=j)
					count++;
			}
			if(count==1) System.out.println(arr[i]);
		}

	}

}
