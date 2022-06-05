package com.Assignment7;

public class Main {
	public static void main(String[] args) {
		
		ABC abc=new ABC();
		
		Thread t1=new Thread(abc,"Thread-1");
//		t1.setPriority(1);
	
		
		Thread t2=new Thread(abc,"Thread-2");
//		t2.setPriority(2);
		
		Thread t3=new Thread(abc,"Thread-3");
//		t3.setPriority(3);
		
		Thread t4=new Thread(abc,"Thread-4");
//		t4.setPriority(5);
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
