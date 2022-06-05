package com.anamika.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course {
	@Id
	private String id;
	private String name;
	private int fee;
	private boolean online;
	private boolean fulltime;
}
