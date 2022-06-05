package com.anamika;

import java.util.*;

public class MergeProcedure {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A[]= {7,9,18,19,22};
		int B[]= {1,6,9,11};
		int C[]=new int[9];
		int i=0,j=0,k=0;
		while(i!=4 && j!=3) {
			if(A[i]<B[j]) {
				C[k]=A[i];
				i++;
			}
			else {
				C[k]=B[j];
				j++;
			}
			k++;
		}
		
		while(i!=4) {
			C[k]=A[i];
			i++;
			k++;
		}
		
		while(j!=3) {
			C[k]=B[j];
			j++;
			k++;
		}
		
		
	for(int x=0;x<9;x++) {
		System.out.print(C[x]+" ");
	}	
	
	}
}
