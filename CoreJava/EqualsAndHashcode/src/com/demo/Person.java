package com.demo;

public class Person {
	
	private String name;
	private int age;
	private int id;
	
	public Person(String name,int age,int id) {
		this.name=name;
		this.age=age;
		this.id=id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
//	@Override
//	public int hashCode() {
//		final int prime=31;
//		int result=0;
//		result+= prime*result + age;
//		result+= prime*result + ((name==null) ? 0 : name.hashCode());
//		return result;
//	}
	
	
	@Override
	public int hashCode() {
		final int prime=31;
		int result=0;
		result+= prime*result + age;
		result+= prime*result + ((name==null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		Person personObj=(Person) obj;
		if(this.name.equals(personObj.getName()) && this.age==personObj.getAge())
			return true;
		return false;
	}

}
