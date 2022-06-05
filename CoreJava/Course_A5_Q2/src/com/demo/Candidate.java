package com.demo;

public class Candidate {
	private String name;
	private String coursetaken;
	private int rollno;
	
	public Candidate(String name, String coursetaken, int rollno) {
		super();
		this.name = name;
		this.coursetaken = coursetaken;
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Candidate [name=" + name + ", coursetaken=" + coursetaken + ", rollno=" + rollno + "]";
	}
	
	
}
