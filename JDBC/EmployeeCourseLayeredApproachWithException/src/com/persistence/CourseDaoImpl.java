package com.persistence;

import com.beans.Course;
import com.beans.Employee;
import com.database.CourseDatabase;
import com.exception.CourseNotFoundException;
import com.exception.CourseRegisterationFullException;


public class CourseDaoImpl implements CourseDao{
	
	CourseDatabase courseDatabase=new CourseDatabase();
	

	@Override
	public Course[] getAllCourses() {
		return courseDatabase.getCourses();
	}

	@Override
	public boolean addEmployeeForCourseId(String registerCourseId, Employee registerEmployee) throws CourseNotFoundException,CourseRegisterationFullException{
		Course[] courses=courseDatabase.getCourses();
		
		for(Course course: courses) {
			if(course.getCId().equals(registerCourseId)) {
				Employee[] employees=course.getEmployees();
				if(course.getEmpCount()<Course.maxCapacity) {
				   employees[course.getEmpCount()]=registerEmployee;
				   course.setEmpCount(course.getEmpCount()+1);
				   return true;
				}
				else throw new CourseRegisterationFullException("Sorry! Registrations are full, Course with course id" + registerCourseId + "can't be registered");
			}
		}
		throw new CourseNotFoundException(registerCourseId + " Course does not exist");
	}

	@Override
	public boolean deleteEmployeeForCourseId(String deregisterCourseId, Employee deregisterEmployee) throws CourseNotFoundException {
		Course[] courses=courseDatabase.getCourses();
		
		for(Course course:courses) {
			
			if(course.getCId().equals(deregisterCourseId)) {
				
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
		throw new CourseNotFoundException(deregisterCourseId+" Course does not exist");
	}

	@Override
	public Employee[] getAllEmployeeForCourse(String courseId) {
		Course courses[]=courseDatabase.getCourses();
		for(Course course: courses) {
			if(course.getCId().equals(courseId)) {
				return course.getEmployees();
			}
		}
		System.out.println("No employees for this course id");
		return null;
	}

}
