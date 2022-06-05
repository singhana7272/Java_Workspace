package com.InterThreadCommunication;

public class Main {

	public static void main(String[] args) {
		
		Q q =new Q();
		
		Producer producer=new Producer(q);
		Consumer consumer=new Consumer(q);
		
		Thread t1=new Thread(producer,"Producer");
		t1.start();
		
//		try { t1.sleep(1000);} catch(Exception e) {}
		
		Thread t2=new Thread(consumer,"Consumer");
		t2.start();
	}

}
