package com.anamika.student;

public class Student {
	private String name;
	private int rollno;
	
	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}
	
}
