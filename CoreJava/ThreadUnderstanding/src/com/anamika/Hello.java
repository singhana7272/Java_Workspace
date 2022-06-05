package com.anamika;

public class Hello /*extends Thread*/ implements Runnable{
	
	public void run() {
		System.out.println("hello start");
		int arr[]= {6,7,8,9,10};
		for(int i=0;i<5;i++) {
			System.out.println("Hello "+arr[i]);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {}
		}
		
		System.out.println("Hello end");
		
	}

}
