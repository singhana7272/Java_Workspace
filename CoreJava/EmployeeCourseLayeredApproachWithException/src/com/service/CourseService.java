package com.service;

import java.util.ArrayList;

import com.beans.Course;
import com.beans.Employee;
import com.exception.CourseNotFoundException;
import com.exception.CourseRegisterationFullException;

public interface CourseService {
	
	Course[] getAllCoursesForEmployee();

	boolean registerEmployeeForCourse(String registerEmployeeId, Employee registerEmployee) throws CourseNotFoundException,CourseRegisterationFullException;

	boolean deregisterEmployeeForCourse(String deregisterCourseId, Employee deregisterEmployee) throws CourseNotFoundException;

	Employee[] getAllEmployeeForSpecificCourse(String courseId);
}
