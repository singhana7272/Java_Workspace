package com.anamika;

public class Hi /*extends Thread*/ implements Runnable{
	
	public void run() {
		System.out.println("hi start");
		int arr[]= {1,2,3,4,5};
		for(int i=0;i<5;i++) {
			System.out.println("Hi "+arr[i]);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {}
		}
		
		System.out.println("Hi end");
	}
	
	

}
