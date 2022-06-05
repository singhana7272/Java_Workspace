package com.newton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class infixtopostfix {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String str=br.readLine();
		int l=str.length(),i=0;
		
		Stack<String> Operator=new Stack<>();
		Stack<String> Operand=new Stack<>();
		
		while(i!=l) {
			if(str.substring(i,i+1).equals("(")) {
				Operator.push("(");
			}
			else if(str.substring(i,i+1).equals("+") || str.substring(i,i+1).equals("-") || str.substring(i,i+1).equals("*") || str.substring(i,i+1).equals("/")){
				while(Operator.size()>0 && Operator.peek()!="(" && precedence(str.substring(i,i+1))>=precedence(Operator.peek())) {
					String value2=Operand.pop();
					String value1=Operand.pop();
					String operator=Operator.pop();
					// String result=value1+value2+operator;
					Operand.push(value1);
					Operand.push(value2);
					Operand.push(operator);
					// Operand.push(result);
				}
				Operator.push(str.substring(i,i+1));
			}
			else if(str.substring(i,i+1).equals(")")) {
				while(Operator.size()>0 && Operator.peek()!="(") {
					String value2=Operand.pop();
					String value1=Operand.pop();
					String operator= Operator.pop();
					// String result=value1+value2+operator;
					Operand.push(value1);
					Operand.push(value2);
					Operand.push(operator);
					// Operand.push(result);
				}
				Operator.pop();
			}
			else {
				Operand.push(str.substring(i,i+1));
			}
			i++;
		}
		while(Operator.size()>0) {
			String operator=Operator.pop();
			String value2=Operand.pop();
			String value1=Operand.pop();
			// String result=value1+value2+operator;
			Operand.push(value1);
			Operand.push(value2);
			Operand.push(operator);
			// Operand.push(result);
		}
		// System.out.println(Operand.peek());
		Operator.clear();
		while(!Operand.isEmpty())
			Operator.push(Operand.pop());
			
	    while(!Operator.isEmpty())
			System.out.print(Operator.pop());
	    }
		
		public static int precedence(String operator) {
			if(operator.equals("+") || operator.equals("-"))
				return 1;
			else if(operator.equals("*") || operator.equals("/"))
				return 2;
			else
				return 3;
		}

}
