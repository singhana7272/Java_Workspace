package com.anamika;
import java.util.*;
public class Eggs {


	public static void main(String[] args){
		int noofeggs;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of eggs");
		noofeggs=sc.nextInt();
		if(noofeggs>=144)
		{
			
			System.out.print("no of gross="+(noofeggs/144)+" ");
		}
		
		int remeggs=(noofeggs%144);
		if(remeggs>=12){
			System.out.print("no of dozens="+(remeggs/12)+" ");
		}
		int remeggs2=remeggs%12;
		if(remeggs2>0) {
			System.out.print(" remaining eggs="+(remeggs2%12)+" ");
		}

	}

}
