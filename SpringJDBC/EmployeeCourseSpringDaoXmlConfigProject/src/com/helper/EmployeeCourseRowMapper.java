package com.helper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bean.Employee;
import com.bean.EmployeeCourse;

public class EmployeeCourseRowMapper implements RowMapper<EmployeeCourse>{

	@Override
	public EmployeeCourse mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		String id=resultSet.getString("empId");
		String name=resultSet.getString("empName");
		String deptt=resultSet.getString("department");
		String design=resultSet.getString("designation");
		int salary=resultSet.getInt("salary");
		String courseId=resultSet.getString("COURSE_ID");
		EmployeeCourse employee=new EmployeeCourse(id,name,deptt,design,salary,courseId);
		return employee;
	}

}
