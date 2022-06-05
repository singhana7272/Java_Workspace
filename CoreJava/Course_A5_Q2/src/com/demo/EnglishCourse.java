package com.demo;

public class EnglishCourse implements Course{
	private String candidatename;
	private static final int fee=500;

	public EnglishCourse(String candidatename) {
		super();
		this.candidatename = candidatename;
	}

	@Override
	public void deliveredtype() {
		System.out.println("English is delivered Online");
	}

	@Override
	public void coursetimetype() {
		System.out.println("This is a part time course");
	}
	
	void fee(){
		System.out.println("Fee for the given course :"+fee);
	}
}
