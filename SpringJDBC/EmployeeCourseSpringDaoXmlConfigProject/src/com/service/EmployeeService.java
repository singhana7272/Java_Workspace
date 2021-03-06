package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Employee;
import com.bean.EmployeeCourse;

public interface EmployeeService {
	boolean registerCourse(String empId,String courseId) throws ClassNotFoundException, SQLException;
	boolean deregisterCourse(String empId,String courseId) throws ClassNotFoundException, SQLException;
	ArrayList<Employee> showAllEmployeesForCourseId(String courseId) throws ClassNotFoundException, SQLException;
	ArrayList<EmployeeCourse> showAllEmployeesWithCourseForCourseId(String courseId) throws ClassNotFoundException, SQLException;

}
