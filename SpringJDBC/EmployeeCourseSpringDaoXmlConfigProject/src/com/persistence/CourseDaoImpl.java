package com.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.Course;
import com.helper.CourseRowMapper;


public class CourseDaoImpl implements CourseDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public ArrayList<Course> showAllCourses() throws SQLException, ClassNotFoundException {
		String query="SELECT * FROM COURSES";
		List<Course> courses=jdbcTemplate.query(query, new CourseRowMapper());
		return (ArrayList<Course>)courses;
	}



}
