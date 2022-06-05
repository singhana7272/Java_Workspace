package com.newton;

import java.util.Scanner;

public class TransposeOfAMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int matrix[][]=new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				matrix[i][j]=i+j;
			}
		}
		
		int transposeMatrix[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				transposeMatrix[i][j]=matrix[j][i];
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(transposeMatrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
