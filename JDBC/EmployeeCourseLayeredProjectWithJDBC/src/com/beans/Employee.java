package com.beans;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee{
	private int empId;
	private String empName;
	private String department;
	private String designation;
	private int salary;
	

}
