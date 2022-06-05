package com.newton;

import java.util.Scanner;

public class BoundaryTraversal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0)
		{
			int rows=sc.nextInt();
			int cols=sc.nextInt();
			
			int matrix[][]=new int[rows][cols];
			int i=0,j=0;
			
			for(i=0;i<rows;i++) {
				for(j=0;j<cols;j++) {
					matrix[i][j]=sc.nextInt();
				}
			}
			
			if(rows==1 || cols==1)
			{
				for(i=0;i<rows;i++) {
					for(j=0;j<cols;j++) {
						System.out.print(matrix[i][j]+" ");
					}
				}
			}
			else
			{
			int x=0,y=0;
//			00 01 02 03
//			10 11 12 13
//			20 21 22 23
//			30 31 32 33
			while(y!=(cols-1)) {
				System.out.print(matrix[x][y]+" ");
				y++;
			}
			//x=0
			//y=3
			
//			while(x!=rows-1) {
//				System.out.print(matrix[x][y]+" ");
//				x++;
//			}
//			
//			while(y!=0) {
//				y--;
//				System.out.print(matrix[x][y]+" ");
//			}
//			
//			while(x!=1) {
//				x--;
//				System.out.print(matrix[x][y]+" ");
//			}
			}
			System.out.println();
		}


	}

}
