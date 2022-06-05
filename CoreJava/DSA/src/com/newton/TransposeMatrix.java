package com.newton;

import java.util.Scanner;
public class TransposeMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int matrix[][]=new int[n][n];
		int i=0,j=0;
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				matrix[i][j]=sc.nextInt();
		int transposeMatrix[][]=new int[n][n];
		
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				transposeMatrix[i][j]=matrix[j][i];
		
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				System.out.print(transposeMatrix[i][j]+" ");
			}
			System.out.println();
		}

	}

}
