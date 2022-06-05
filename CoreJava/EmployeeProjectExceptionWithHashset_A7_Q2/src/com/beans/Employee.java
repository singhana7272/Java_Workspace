package com.beans;

import java.util.ArrayList;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor

public class Employee {
	
//	@Getter
//	@Setter
////	private int employeeId;
	
	@Getter
	@Setter
	private String name;
	
	@Getter
	@Setter
	private int age;
	
	@Override
	public String toString() {
		return "Employee(this.name "+" this.age )";
	}

}
