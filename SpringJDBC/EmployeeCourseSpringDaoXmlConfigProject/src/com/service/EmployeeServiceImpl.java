package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.bean.EmployeeCourse;
import com.persistence.EmployeeDao;
import com.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao employeeDao;

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public boolean registerCourse(String empId, String courseId) throws ClassNotFoundException, SQLException {
		return employeeDao.registerCourse(empId, courseId);
	}

	@Override
	public boolean deregisterCourse(String empId, String courseId) throws ClassNotFoundException, SQLException {
		return employeeDao.deregisterCourse(empId, courseId);
	}

	@Override
	public ArrayList<Employee> showAllEmployeesForCourseId(String courseId) throws ClassNotFoundException, SQLException {
		return employeeDao.ShowAllEmployeesForCourseId(courseId);
	}

	@Override
	public ArrayList<EmployeeCourse> showAllEmployeesWithCourseForCourseId(String courseId)
			throws ClassNotFoundException, SQLException {
		
		return employeeDao.ShowAllEmployeesWithCourseIdForCourseId(courseId);
	}

}
