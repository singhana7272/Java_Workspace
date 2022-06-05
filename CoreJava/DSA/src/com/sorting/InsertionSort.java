package com.sorting;
import java.util.*;

public class InsertionSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		display(arr,n);
		insertionSort(arr,n);
		display(arr,n);
	}
	
	
	public static void insertionSort(int arr[],int n){
		for(int i=1;i<=(n-1);i++) {
			int key=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}arr[j+1]=key;
		}
	}
	
	public static void display(int arr[],int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
