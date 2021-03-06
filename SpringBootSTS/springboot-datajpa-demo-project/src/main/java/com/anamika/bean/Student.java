package com.anamika.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "Students")
public class Student {

	@Id
	@Column(name="StudentId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="StudentName")
	private String name;
	private String department;
	private String designation;
	private int salary;
	
	public Student(String name, String department, String designation, int salary) {
		super();
		this.name = name;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}
	
	
}
