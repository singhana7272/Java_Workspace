package com.InterThreadCommunication;

public class Q {
	
	int num;
	
	boolean valueSet=false;
	public synchronized void put(int num) {
		
		while(valueSet) {
			try { wait();}catch(Exception e) {}
		}
		try {Thread.sleep(1000);} catch(Exception e) {}
		this.num=num;
		System.out.println("Put "+this.num);
		valueSet=true;
		notify();
	} 
	
	public synchronized void get() {
		while(!valueSet) {
			try { wait();} catch(Exception e) {}
		}
		System.out.println("Get "+this.num);
		valueSet=false;
		notify();
	}
}
