package com.helper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bean.Registrations;

public class RegistrationRowMapper implements RowMapper<Registrations>{

	@Override
	public Registrations mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		String empId=resultSet.getString("empId");
		String course_id=resultSet.getString("course_id");
		Registrations registration=new Registrations(empId, course_id);
		return registration;
	}

}
