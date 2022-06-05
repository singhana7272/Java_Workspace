package com.newton;

import java.util.Scanner;
import java.util.Stack;

public class Evaluate {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		String num=sc.nextLine();
		int n=Integer.parseInt(num);
		int i=0,result=0;
		String str[]=sc.nextLine().split(" ");
		Stack<Integer> st=new Stack<>();
		while(i!=(n-1)){
			if(str[i]=="*" || str[i]=="+" || str[i]=="-" || str[i]=="/" )
			{
				int a=st.pop();
				int b=st.pop();
				String op=str[i];
				if(op.equals("*"))
					result=a*b;
				else if(op.equals("+"))
					result=a+b;
				else if(op.equals("/"))
					result=a/b;
	            else
					result=a-b;
				st.push(result);
			}
			else
			{	
				int k=Integer.parseInt(str[i]);
				st.push(k);
			}
			i++;	
		}
		System.out.print(st.peek());
	}
}
