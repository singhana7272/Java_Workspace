package com.newton;

import java.util.Scanner;

public class AlternateMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long black=0,white=0;
		int i=0,j=0;
		
//		for(i=0;i<n;i++)
//			for(j=0;j<n;j++)
//				matrix[i][j]=sc.nextLong();
//		
//		for(i=0;i<n;i++) {
//			if(i%2==0) {
//				for(j=0;j<n;j=j+2) {
//					black+=matrix[i][j];
//				}
//			}
//			else {
//				for(j=1;j<n;j=j+2) {
//					black+=matrix[i][j];
//				}
//			}
//		}
//		
//		for(i=0;i<n;i++) {
//			if(i%2==0) {
//				for(j=1;j<n;j=j+2) {
//					white+=matrix[i][j];
//				}
//			}
//			else {
//				for(j=0;j<n;j=j+2) {
//					white+=matrix[i][j];
//				}
//			}
//		}
		
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				if((i+j)%2==0)
					black+=sc.nextInt();
				else
					white+=sc.nextInt();
		
	   	
		System.out.println(black);
		System.out.println(white);
		

	}

}
