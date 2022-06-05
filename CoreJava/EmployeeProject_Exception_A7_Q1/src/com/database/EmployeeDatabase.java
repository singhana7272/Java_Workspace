package com.database;

import java.util.HashSet;
import java.util.Set;

import com.beans.Employee;

import lombok.Getter;
import lombok.Setter;

public class EmployeeDatabase {
	@Getter
	@Setter
	private static Set<Employee> employeeSet=new HashSet<>();
	
//	static {
//		employees.add(new Employee(101,"kevin",45));
//		employees.add(new Employee(102,"sara",30));
//		employees.add(new Employee(103,"peter",24));
//		employees.add(new Employee(104,"josh",21));
//	}
}
