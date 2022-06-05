package com.typesofworker;

public class Main {
	
	public static void main(String args[]){
		Worker worker1=new Worker("peter",200,12);
		System.out.println(worker1.methodPay(34));
		
		Worker worker2=new DailyWorker("george",300,28,12);
		System.out.println(worker2.methodPay(12));
		
		Worker worker3=new SalariedWorker("sara",800,1000);
		System.out.println(worker3.methodPay(22));
	}

}
