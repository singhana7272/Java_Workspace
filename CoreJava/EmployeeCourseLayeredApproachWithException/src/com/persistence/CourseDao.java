package com.persistence;

import com.beans.Course;
import com.beans.Employee;
import com.exception.CourseNotFoundException;
import com.exception.CourseRegisterationFullException;
public interface CourseDao {

	Course[] getAllCourses();

	boolean addEmployeeForCourseId(String registerCourseId, Employee registerEmployee) throws CourseNotFoundException,CourseRegisterationFullException;

	boolean deleteEmployeeForCourseId(String deregisterCourseId, Employee deregisterEmployee) throws CourseNotFoundException;

	Employee[] getAllEmployeeForCourse(String courseName);

}
