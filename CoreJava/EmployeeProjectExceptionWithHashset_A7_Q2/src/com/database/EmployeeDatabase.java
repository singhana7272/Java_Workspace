package com.database;

import java.util.ArrayList;

import com.beans.Employee;

import lombok.Getter;
import lombok.Setter;

public class EmployeeDatabase {
	@Getter
	@Setter
	private static ArrayList<Employee> employees=new ArrayList<>();
	
//	static {
//		employees.add(new Employee(101,"kevin",45));
//		employees.add(new Employee(102,"sara",30));
//		employees.add(new Employee(103,"peter",24));
//		employees.add(new Employee(104,"josh",21));
//	}
}
