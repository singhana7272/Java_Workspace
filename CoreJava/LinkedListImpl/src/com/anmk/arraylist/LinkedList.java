package com.anmk.arraylist;

public class LinkedList<T> {
	Node<T> head;
	Node<T> tail;
	int size;
	
	boolean isEmpty(){
		return size==0;
	}
	
	public void addLast(T val) {
		Node<T> node=new Node<>(val);
		if(isEmpty()) {
			head=tail=node;
		}
		else {
			tail.next=node;
			tail=node;
		}
		size++;
	}
	
	public void printList() {
		Node<T> node=head;
		while(node!=null) { 
			System.out.print(node.val+" ");
			node=node.next;
		}
	}
}
