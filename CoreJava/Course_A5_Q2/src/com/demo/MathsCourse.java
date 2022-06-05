package com.demo;

public class MathsCourse implements Course{
	private String candidatename;
	private static final int fee=1000;

	public MathsCourse(String candidatename) {
		super();
		this.candidatename = candidatename;
	}
	
	@Override
	public void deliveredtype() {
		System.out.println("Maths is delivered Offline");
	}

	@Override
	public void coursetimetype() {
		System.out.println("This is a Part time course");
	}

	void fee(){
		System.out.println("Fee for the given course :"+fee);
	}

}
