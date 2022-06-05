package com.anamika;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Frequency {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String str=br.readLine();
		char ch=br.readLine().charAt(0);
		System.out.println(frequencyChar(ch,str));
	}
	
	public static int frequencyChar(char ch,String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(Character.toLowerCase(str.charAt(i))==Character.toLowerCase(ch))
				count++;
		}
		return count;
	}

}
