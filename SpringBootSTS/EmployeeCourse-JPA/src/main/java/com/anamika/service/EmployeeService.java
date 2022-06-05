package com.anamika.service;

import java.util.ArrayList;

import com.anamika.bean.Course;
import com.anamika.bean.Employee;

public interface EmployeeService {
	Employee searchEmployeeById(String empId);
	boolean register(String empId, String courseId);
	boolean deregister(String empId,String courseId);
	ArrayList<Employee> showAllEmployeesForSpecificCourse(String courseId);

}
