package com.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Course;

@Repository
public class CourseDaoImpl implements CourseDao {
	@Autowired
	private DataSource dataSource;
	
//	private static final String url="jdbc:mysql://localhost:3306/employeecoursedb";
//	private static final String user="root";
//	private static final String password="admin";

	@Override
	public ArrayList<Course> showAllCourses() throws SQLException, ClassNotFoundException {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection connection=DriverManager.getConnection(url,user,password);
		Connection connection=dataSource.getConnection();
		String query="SELECT * FROM COURSES";
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		ResultSet resultSet=preparedStatement.executeQuery();
		ArrayList<Course> courses=new ArrayList<>();
		
		while(resultSet.next()) {
			String courseId=resultSet.getString("course_id");
			String courseName=resultSet.getString("course_name");
			int courseFee=resultSet.getInt("course_fee");
			boolean online=resultSet.getBoolean("online");
			boolean fulltime=resultSet.getBoolean("fulltime");
			
			Course course=new Course(courseId,courseName,courseFee,online,fulltime);
			courses.add(course);
		}
		connection.close();
		
		return courses;
	}



}
