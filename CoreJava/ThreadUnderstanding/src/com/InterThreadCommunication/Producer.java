package com.InterThreadCommunication;

public class Producer implements Runnable{
	
	Q q;
	
	public Producer(Q q) {
		this.q=q;
	}
	
	public void run() {
		int i=0;
		
		while(true) {
			q.put(i++);
			try { Thread.sleep(1000);}catch(Exception e) {}
		}
	}

}
