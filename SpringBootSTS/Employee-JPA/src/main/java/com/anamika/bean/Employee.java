package com.anamika.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="Emplo")
public class Employee {

	@Id
	private String id;
	private String name;
	private String department;
	private String designation;
	private int salary;
	
	
}
