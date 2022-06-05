package com.service;

import java.util.ArrayList;

import com.beans.Course;
import com.beans.Employee;

public interface CourseService {
	
	Course[] getAllCoursesForEmployee();

	boolean registerEmployeeForCourse(String registerEmployeeId, Employee registerEmployee);

	boolean deregisterEmployeeForCourse(String deregisterCourseId, Employee deregisterEmployee);

	Employee[] getAllEmployeeForSpecificCourse(String courseId);
}
