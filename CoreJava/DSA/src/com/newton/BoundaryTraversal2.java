package com.newton;

import java.util.Scanner;

public class BoundaryTraversal2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int matrix[][] = new int[n][m];
			int i = 0, j = 0;

			for (i = 0; i < n; i++) {
				for (j = 0; j < m; j++) {
					matrix[i][j] = sc.nextInt();
				}
			}
//			00 01 02 03
//			10 11 12 13
//			20 21 22 23
//			30 31 32 33

			for (i = 0; i < n; i++) {
				for (j = 0; j < m; j++) {
					if (i == 0 || j == (m - 1))
						System.out.print(matrix[i][j] + " ");
				}
			}

			for (i = n - 1; i > 0; i--) {
				for (j = m - 2; j >= 0; j--) {
					if (i == (n - 1) || j == 0)
						System.out.print(matrix[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

}
