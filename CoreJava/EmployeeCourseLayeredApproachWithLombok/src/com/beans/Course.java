package com.beans;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Course{
	
    @Getter
    @Setter
	private String cId;
    
    @Getter
    @Setter
	private String courseName;
    
    @Getter
    @Setter
	private int courseFee;
    
    @Getter
    @Setter
	private boolean online;
    
    @Getter
    @Setter
	private boolean fullTime;
    
    @Getter
    @Setter
	private int empCount;
    
    @Getter
    @Setter
	private Employee employees[];
    
    
	
	}
