package com.anamika.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anamika.bean.Course;
import com.anamika.bean.Employee;
import com.anamika.persistence.CourseDao;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;

	@Override
	public ArrayList<Course> showAllCourses() {
		return (ArrayList<Course>)courseDao.findAll();
	}

	@Override
	public Course getCourseById(String courseId) {
		return courseDao.findById(courseId).get();
	}
	
	
	
	

}
