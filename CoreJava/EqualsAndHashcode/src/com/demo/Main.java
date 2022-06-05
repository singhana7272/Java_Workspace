package com.demo;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Person person1=new Person("kishan",21,1);
		Person person2=new Person("kishan",21,2);
		Person person3=new Person("Ram",21,3);
		
		Set<Person> set=new HashSet<>();
		Set<Integer> intSet=new HashSet<>();
		Integer three=new Integer(3);
		intSet.add(three);
		intSet.add(new Integer(1));
		intSet.add(2);
		intSet.add(2);
		
		System.out.println(intSet);
		set.add(person1);
		set.add(person2);
		set.add(person3);
		
		for(Person person : set) {
			System.out.println(person.getId() +"->"+person.hashCode());
		}
		
		System.out.println(person1.equals(person2));
		
		System.out.println(set.size());

	}

}
