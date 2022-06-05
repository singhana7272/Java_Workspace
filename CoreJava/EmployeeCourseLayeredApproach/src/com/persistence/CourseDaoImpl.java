package com.persistence;

import com.beans.Course;
import com.beans.Employee;
import com.database.CourseDatabase;

public class CourseDaoImpl implements CourseDao{
	
	CourseDatabase courseDatabase=new CourseDatabase();

	@Override
	public Course[] getAllCourses() {
		return courseDatabase.getCourses();
	}

	@Override
	public boolean addEmployeeForCourseId(String registerCourseId, Employee registerEmployee) {
		Course[] courses=courseDatabase.getCourses();
		
		for(Course course: courses) {
			if(course.getcId().equals(registerCourseId)) {
				Employee[] employees=course.getEmployees();
				employees[course.getEmpCount()]=registerEmployee;
				course.setEmpCount(course.getEmpCount()+1);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteEmployeeForCourseId(String deregisterCourseId, Employee deregisterEmployee) {
		Course[] courses=courseDatabase.getCourses();
		
		for(Course course:courses) {
			
			if(course.getcId().equals(deregisterCourseId)) {
				
				Employee[] employees=course.getEmployees();
				for(int i=0;i<course.getEmpCount();i++) {
					if(employees[i].getEmpId()==deregisterEmployee.getEmpId()) {
						while(i<course.getEmpCount()-1) {
							employees[i]=employees[i+1];
							i++;
						}
						course.setEmpCount(course.getEmpCount()-1);
						employees[i]=null;
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public Employee[] getAllEmployeeForCourse(String courseId) {
		Course courses[]=courseDatabase.getCourses();
		for(Course course: courses) {
			if(course.getcId().equals(courseId)) {
				return course.getEmployees();
			}
		}
		System.out.println("No employees for this course id");
		return null;
	}

}
