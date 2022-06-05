package com.anamika.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Registrations {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int registrationId;
	@OneToOne
	private Course course;
	@OneToOne
	private Employee employee;
	public Registrations(Course course, Employee employee) {
		super();
		this.course = course;
		this.employee = employee;
	}
	
	
}
