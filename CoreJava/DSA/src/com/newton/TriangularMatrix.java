package com.newton;

import java.util.Scanner;

public class TriangularMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long matrix[][]=new long[n][n];
		int i=0,j=0;
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++) {
				matrix[i][j]=sc.nextLong();
			}
		}
		
		long upperMatrix=0,lowerMatrix=0;
		
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i<=j) {
					upperMatrix+=matrix[i][j];
				}
				if(i>=j) {
					lowerMatrix+=matrix[i][j];
				}
			}
		}
		
		System.out.print(upperMatrix+" "+lowerMatrix);
	}

}
