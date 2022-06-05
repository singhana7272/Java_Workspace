package com.anamika;

import java.util.*;

public class AmazonQuestion1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int k=n-1;
		String str="";
		while(str.length()!=2)
		{
		str="";
		for(int j=0;j<k;j++){
			arr[j]+=arr[j+1];
			if(arr[j]>10) arr[j]=arr[j]%10;
			if(arr[j]==10) arr[j]=0;
			str+=Character.forDigit(arr[j],10);
		}
		k--;
		}
		System.out.print(str);

		
	}
}

