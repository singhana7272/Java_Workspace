package com.persistence;

import com.beans.Course;
import com.beans.Employee;

public interface CourseDao {

	Course[] getAllCourses();

	boolean addEmployeeForCourseId(String registerCourseId, Employee registerEmployee);

	boolean deleteEmployeeForCourseId(String deregisterCourseId, Employee deregisterEmployee);

	Employee[] getAllEmployeeForCourse(String courseName);

}
