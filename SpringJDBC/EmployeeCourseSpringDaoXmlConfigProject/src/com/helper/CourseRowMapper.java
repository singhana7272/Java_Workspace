package com.helper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bean.Course;

public class CourseRowMapper implements RowMapper<Course>{

	@Override
	public Course mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		String cId=resultSet.getString("course_id");
		String cName=resultSet.getString("course_name");
		int cFee=resultSet.getInt("course_fee");
		boolean online=resultSet.getBoolean("online");
		boolean fullTime=resultSet.getBoolean("fulltime");
		
		Course course=new Course(cId,cName,cFee,online,fullTime);
		return course;
	}

}
