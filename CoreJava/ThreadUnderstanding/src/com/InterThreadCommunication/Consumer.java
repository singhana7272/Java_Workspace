package com.InterThreadCommunication;

public class Consumer implements Runnable{
	Q q;
	
	
	public Consumer(Q q) {
		this.q=q;
	}
	
	public void run() {
		int i;
		while(true) {
			q.get();
			try {Thread.sleep(5000);} catch(Exception e) {} 
		}
	}
}
