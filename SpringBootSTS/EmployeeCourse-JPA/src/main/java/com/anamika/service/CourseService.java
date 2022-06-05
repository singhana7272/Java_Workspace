package com.anamika.service;

import java.util.ArrayList;

import com.anamika.bean.Course;
import com.anamika.bean.Employee;

@SuppressWarnings("unused")
public interface CourseService {

	ArrayList<Course> showAllCourses();
	public Course getCourseById(String courseId);

}
