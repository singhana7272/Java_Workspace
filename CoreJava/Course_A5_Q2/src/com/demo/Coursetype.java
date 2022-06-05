package com.demo;

public class Coursetype{
	private Course course;
	private String coursename;
	
	public Coursetype(Course course, String coursename) {
		super();
		this.course = course;
		this.coursename = coursename;
	}

	void display(){
		course.deliveredtype();
		course.coursetimetype();
	}

}
