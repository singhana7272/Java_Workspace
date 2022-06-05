package com.newton;

public class ComputePower {
	public static void main(String[] args) {
		
	}
	
	static int Power(int n,int p)
	{
	      // Your code here 
	      if(p>0)
	      {
	            return n*Power(n,p--);
	      }
	      else return 1;
	}

}
