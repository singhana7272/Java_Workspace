package com.newton;

import java.util.Scanner;

public class PrintMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int matrix[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				matrix[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
