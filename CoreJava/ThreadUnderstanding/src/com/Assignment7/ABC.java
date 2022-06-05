package com.Assignment7;

public class ABC implements Runnable{
	
	
    @Override
	public synchronized void run() {
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive());
		System.out.println(Thread.currentThread().getState());
		System.out.println(Thread.currentThread().getPriority());
		 
		System.out.println();
		
	}
}
