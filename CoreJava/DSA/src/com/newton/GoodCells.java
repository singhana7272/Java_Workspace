package com.newton;

import java.util.Scanner;
public class GoodCells {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int matrix[][]=new int[n][m];
	int i=0,j=0;
	for(i=0;i<n;i++) {
		for(j=0;j<m;j++) {
			matrix[i][j]=sc.nextInt();
		}
	}
	
	int count=0;
	for(i=1;i<n-1;i++) {
		for(j=1;j<m-1;j++) {
			int x=i,y=j;
			if(matrix[x-1][y]==1 && matrix[x+1][y]==1 && matrix[x][y+1]==1 && matrix[x][y-1]==1) {
				count++;
			}	
		}
	}
	
	
	System.out.print(count);
	
	}
}
