package com.anamika.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anamika.bean.Course;
import com.anamika.bean.Employee;
import com.anamika.bean.Registrations;
import com.anamika.persistence.EmployeeDao;
import com.anamika.persistence.RegisterDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private RegisterDao registerDao;
	@Autowired
	private CourseService courseService;
	
	@Override
	public Employee searchEmployeeById(String empId) {
		return employeeDao.findById(empId).get();
	}

	@Override
	public boolean register(String empId, String courseId) {
		Registrations registeration=new Registrations(courseService.getCourseById(courseId),this.searchEmployeeById(empId));
		registerDao.save(registeration);
		return true;
	}

	@Override
	public boolean deregister(String empId,String courseId) {
		Registrations registeration=new Registrations(courseService.getCourseById(courseId),this.searchEmployeeById(empId));
		registerDao.delete(registeration);
		return true;
	}

	@Override
	public ArrayList<Employee> showAllEmployeesForSpecificCourse(String courseId) {
		return null;
	}

}
