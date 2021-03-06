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
import org.springframework.jdbc.core.JdbcTemplate;import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.bean.Employee;
import com.bean.EmployeeCourse;
import com.bean.Registrations;
import com.helper.EmployeeCourseRowMapper;
import com.helper.EmployeeRowMapper;
import com.helper.RegistrationRowMapper;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public boolean registerCourse(String empId, String courseId) throws ClassNotFoundException, SQLException {
		String query="insert into registrations(empId,course_id) values (?,?)";
		int row=jdbcTemplate.update(query, empId,courseId);
		if(row>0)
			return true;
		else
			return false;
	}
	
	@Override
	public boolean deregisterCourse(String empId, String courseId) throws ClassNotFoundException, SQLException {
		String query="delete from registrations where empId=? and course_id=?";
		int row=jdbcTemplate.update(query, empId,courseId);
		if(row==1)
			return true;
		else
			return false;
	}
	
	@Override
	public ArrayList<Employee> ShowAllEmployeesForCourseId(String courseId) throws ClassNotFoundException, SQLException {
		String query="select e.* from registrations r JOIN employees e ON r.empId=e.empId where course_id=?";
		List<Employee> employees=jdbcTemplate.query(query, new EmployeeRowMapper(), courseId);
		return (ArrayList<Employee>) employees;
	}
	
	@Override
	public ArrayList<EmployeeCourse> ShowAllEmployeesWithCourseIdForCourseId(String courseId) throws ClassNotFoundException, SQLException {
		String query="select e.*,r.course_id from registrations r JOIN employees e ON r.empId=e.empId where course_id=?";
		List<EmployeeCourse> employees=jdbcTemplate.query(query, new EmployeeCourseRowMapper(), courseId);
		return (ArrayList<EmployeeCourse>) employees;
	}
	
	
}
