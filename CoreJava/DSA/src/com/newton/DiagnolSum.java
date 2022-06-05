package com.newton;

import java.util.Scanner;

public class DiagnolSum {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	long matrix[][]=new long[n][n];
	long primarySum=0,secondarySum=0;
	int i=0,j=0;
	for(i=0;i<n;i++) {
		for(j=0;j<n;j++) {
			matrix[i][j]=sc.nextLong();
		}
	}
	
	for(i=0;i<n;i++) {
		for(j=0;j<n;j++) {
			if(i==j) {
				primarySum+=matrix[i][j];
			}
			if((i+j)==(n-1))
			{
				secondarySum+=matrix[i][j];
			}
		}
	}
	
	System.out.println(primarySum+" "+secondarySum);
	
		
	}

}
