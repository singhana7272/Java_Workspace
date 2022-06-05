package com.anamika;

import java.util.Scanner;

public class AmazonQuestion2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str="";
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();

		int a=0,b=0;
		for(int i=0;i<n;i++){
			a=0;
			b=0;
			for(int j=i+1;j<n;j++){
				if(Math.abs(arr[i]-arr[j])<=k){
					if(str.indexOf(Character.forDigit(arr[i],10))==-1){
						str+=Character.forDigit(arr[i],10);
						a=1;
					}
					if(str.indexOf(Character.forDigit(arr[j],10))==-1){
						str+=Character.forDigit(arr[j],10);
						b=1;
					}
					
				}
				
			}
			if(a==1&&b==1) str+="*";
			
		}
		int pair=0;
		for(int i=0;i<str.length()-1;i++){
			if(str.charAt(i)=='*'){
				pair++;
			}
		}
		
		System.out.println(pair+1);
		}
		
		
	}


