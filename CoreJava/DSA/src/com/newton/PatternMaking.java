package com.newton;

public class PatternMaking {

	public static void main(String[] args) {
	    int i=0,j=0,x=0;
	    
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j+" ");
		    }
			
			int k=j-1;
			
			for(x=k-1;x>0;x--) {
				System.out.print(x+" ");
			}
		    System.out.println();
		}
		
		for(i=4;i>0;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(j+" ");
		    }
			
			int l=i-1;
			for(x=l;x>0;x--) {
				System.out.print(x+" ");
			}
			System.out.println();
		}

	}

}
