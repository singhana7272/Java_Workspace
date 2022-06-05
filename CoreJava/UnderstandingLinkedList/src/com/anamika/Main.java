package com.anamika;

public class Main {

	public static void main(String[] args) {
	LinkedList list=new LinkedList();
	
//	list.addStart(2);
//	list.addStart(3);
	list.addLast(7);
	list.addLast(6);
	list.addLast(5);
	list.addLast(4);
	list.addLast(3);
	list.addLast(2);
	list.addLast(1);
//	list.addElement(33,1);
	list.printList();
	System.out.println();
	list.swapkthnode(6,2);
	
//	list.deleteLast();
//	list.deleteStart();
	list.printList();
	}

}
