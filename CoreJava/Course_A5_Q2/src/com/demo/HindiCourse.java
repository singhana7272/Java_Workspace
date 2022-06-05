package com.demo;

public class HindiCourse implements Course{
	private String candidatename;
	private static final int fee=400;

	public HindiCourse(String candidatename) {
		super();
		this.candidatename = candidatename;
	}

	@Override
	public void deliveredtype() {
		System.out.println("Hindi is delivered Online");
	}

	@Override
	public void coursetimetype() {
		System.out.println("This is a full time course");
	}

	void fee(){
		System.out.println("Fee for the given course :"+fee);
	}
	
}
