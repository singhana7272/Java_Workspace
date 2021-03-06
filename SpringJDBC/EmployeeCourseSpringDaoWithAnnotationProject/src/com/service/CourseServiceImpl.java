package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Course;
import com.persistence.CourseDao;
import com.persistence.CourseDaoImpl;
import com.persistence.EmployeeDao;
import com.persistence.EmployeeDaoImpl;
@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
	@Override
	public ArrayList<Course> showAllCourses() throws ClassNotFoundException, SQLException {
		return courseDao.showAllCourses();
	}

}
