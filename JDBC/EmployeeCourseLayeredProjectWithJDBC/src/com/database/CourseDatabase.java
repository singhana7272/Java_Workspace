package com.database;

import com.beans.Course;
import com.beans.Employee;

public class CourseDatabase {
	private static Course[] courses=new Course[5];
	
	static {
		courses[0]=new Course("C001", "JAVA", 20000, true, true,0,new Employee[3]);
		courses[1]=new Course("C002", "Spring", 30000, true, false,0,new Employee[3]);
		courses[2]=new Course("C003", "Hibernate", 25000, true, false,0,new Employee[3]);
		courses[3]=new Course("C004", "React JS", 40000, true, true,0,new Employee[3]);
		courses[4]=new Course("C005", "Angular JS", 50000, true, true,0,new Employee[3]);

	}

	public static Course[] getCourses() {
		return courses;
	}

	public static void setCourses(Course[] courses) {
		CourseDatabase.courses = courses;
	}
	
	

}
