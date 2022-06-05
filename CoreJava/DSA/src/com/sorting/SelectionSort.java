//mylogic

package com.sorting;
import java.util.*;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		display(arr,n);
		System.out.println("after selection sort:");
		selectionSort(arr,n);
		display(arr,n);
	}
	
	
	public static void selectionSort(int arr[],int n){
		for(int i=0;i<n;i++) {
			int min=arr[i],min_index=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<min) {
					min_index=j;
					min=arr[j];
				}
			}
			int temp=arr[min_index];
			arr[min_index]=arr[i];
			arr[i]=temp;
		}
	}
	
	public static void display(int arr[],int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
