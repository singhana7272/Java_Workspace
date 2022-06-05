package com.anamika;

public class LinkedList {
	
	Node head;
	Node tail;
	int size;
	
	public void addLast(int value) {
		Node node=new Node(value);
		if(this.size==0) {
			head=tail=node;
			
		}
		else {
			tail.next=node;
			tail=node;
		}
		size++;
	}
	
	public void addStart(int value) {
		Node node =new Node(value);
		if(this.size==0) {
			head=tail=node;
		}else {
			node.next=head;
			head=node;
		}
		size++;
	}
	
	public void deleteLast() {
		if(this.size==0) {
			System.out.println("List is empty");
		}
		else if(this.size==1) {
			head=tail=null;
			size--;		
		}
		else {
		Node node=head;
		while(node.next.next!=null) {
			node=node.next;
		}
		node.next=null;
		tail=node;
		size--;
		}
	}
	
	public void deleteStart() {
		if(this.size==0) {
			System.out.println("List is empty");
		}
		else if(this.size==1) {
			head=tail=null;
			size--;
		}
		else {
//			Node node=head.next;
//			head=null;
//			head=node;
			head=head.next;
			size--;
		}
	}
	
	public void addElement(int k ,int pos) {
		Node node=new Node(k);
		if(pos==1){
		    node.next=head;
		    head=node;
		}
		else{
		Node temp=head;
		while((pos-1) > 1){
		    temp=temp.next;
		    pos--;
		}
		node.next=temp.next;
		temp.next=node;
		}
		}
	
	public void swapkthnode(int num, int K)
	{
		int start=K;
	    int end=num-K+1,diff=end-start;
	    Node temp=head;
	    while(start>1){
	        temp=temp.next;
	        start--;
	    }
	    Node E_prev=temp;
	    Node E=temp.next;

	    while(diff>1){
	        temp=temp.next;
	        diff--;
	    }
	    Node F_prev=temp;
	    Node F=temp.next;

	    if(E_prev!=null)
	        E_prev.next=F;
	    
	    if(F_prev!=null)
	        F_prev.next=E;

	    Node T=E.next;
	    E.next=F.next;
	    F.next=T;

	    
	}
	
	
	
	public void printList() {
		Node node=head;
		while(node!=null) {
			System.out.print(node.data+" ");
			node=node.next;
		}
	}

}
