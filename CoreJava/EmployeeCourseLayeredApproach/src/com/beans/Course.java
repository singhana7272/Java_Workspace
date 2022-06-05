package com.beans;

import java.util.Arrays;

public class Course{

	private String cId;
	private String courseName;
	private int courseFee;
	private boolean online;
	private boolean fullTime;
	private Employee employees[];
	private int empCount;
	
	public Course(String cId,String courseName, int courseFee, boolean online, boolean fullTime) {
		super();
		this.cId=cId;
		this.courseName = courseName;
		this.courseFee = courseFee;
		this.online = online;
		this.fullTime = fullTime;
		this.employees = new Employee[10];
		empCount=0;
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}

	public boolean isOnline() {
		return online;
	}

	public void setOnline(boolean online) {
		this.online = online;
	}

	public boolean isFullTime() {
		return fullTime;
	}

	public void setFullTime(boolean fullTime) {
		this.fullTime = fullTime;
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	public int getEmpCount() {
		return empCount;
	}

	public void setEmpCount(int empCount) {
		this.empCount = empCount;
	}
	
	
	@Override
	public String toString() {
		return "Course [cId=" + cId + ", courseName=" + courseName + ", courseFee=" + courseFee + ", online=" + online
				+ ", fullTime=" + fullTime + "]";
	}
	
}
