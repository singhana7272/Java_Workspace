package com.anamika;

public class Main {

	public static void main(String[] args) {
		System.out.println("main start");
		Hi obj1=new Hi();
		Hello obj2=new Hello();
		
		Thread t=new Thread();
		Thread t1=new Thread(obj1,"abc");
		
		Thread t2=new Thread(obj2);
//		System.out.println(t1.isAlive());
//		System.out.println(Thread.currentThread().getName()+" "+t1.getName()+" "+t.getName()+" "+t2.getName());
//		obj1.start();
//	    try{Thread.sleep(100);}catch(Exception e) {}
//		obj2.start();
		
//		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		
//		t1.start();
//		System.out.println(t1.isAlive());
//	    try{Thread.sleep(100);}catch(Exception e) {}
		t2.start();
//		try{Thread.sleep(6000);}catch(Exception e) {}
		
		
		
		try{t1.join();} catch(Exception e) {System.out.println("exception occured in t1");}
		System.out.println("t1 join");
		try{t2.join();} catch(Exception e) {}
		System.out.println("t2 join");
		
		System.out.println("main end");

	}

}
