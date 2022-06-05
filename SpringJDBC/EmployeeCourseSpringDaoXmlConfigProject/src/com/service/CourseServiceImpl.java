package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Course;
import com.persistence.CourseDao;
import com.persistence.CourseDaoImpl;
import com.persistence.EmployeeDao;
import com.persistence.EmployeeDaoImpl;


public class CourseServiceImpl implements CourseService {
	
	private CourseDao courseDao;
	
	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
	}

	@Override
	public ArrayList<Course> showAllCourses() throws ClassNotFoundException, SQLException {
		return courseDao.showAllCourses();
	}

}
