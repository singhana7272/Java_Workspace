package com.service;

import com.beans.Course;
import com.beans.Employee;
import com.persistence.CourseDao;
import com.persistence.CourseDaoImpl;

public class CourseServiceImpl implements CourseService{
	
	CourseDao courseDao=new CourseDaoImpl();

	@Override
	public Course[] getAllCoursesForEmployee() {
		return courseDao.getAllCourses();
	}

	@Override
	public boolean registerEmployeeForCourse(String registerCourseId, Employee registerEmployee) {
		
		return courseDao.addEmployeeForCourseId(registerCourseId,registerEmployee);
	}

	@Override
	public boolean deregisterEmployeeForCourse(String deregisterCourseId, Employee deregisterEmployee) {
		return courseDao.deleteEmployeeForCourseId(deregisterCourseId,deregisterEmployee);
	}

	@Override
	public Employee[] getAllEmployeeForSpecificCourse(String courseId) {
		return courseDao.getAllEmployeeForCourse(courseId);
	}

	

}
