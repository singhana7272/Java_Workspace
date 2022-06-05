package com.list;

public class Array<T>{
	T arr[];
	int size;
	
	@SuppressWarnings("unchecked")
	public Array(){
		arr=(T[]) new Object[5];
		size=0;
	}
	
	public void addElement(T ele){
		this.arr[size]=ele;
		size++;
	}
	
	public void display(T arr[]){
		for(T ele:arr){
			System.out.println(ele);
		}
	}
}
