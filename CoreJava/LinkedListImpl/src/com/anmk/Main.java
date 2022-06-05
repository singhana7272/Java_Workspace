package com.anmk;

import com.anmk.arraylist.LinkedList;

public class Main {

	public static void main(String[] args){
		LinkedList<Integer> list=new LinkedList<>();
		
//		list.addLast("hello");
//		list.addLast("world");
		list.addLast(3);
		list.addLast(4);
		list.addLast(5); 
		
		list.printList(); 
	}
}
