package com.helper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bean.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		String id=resultSet.getString("empId");
		String name=resultSet.getString("empName");
		String deptt=resultSet.getString("department");
		String design=resultSet.getString("designation");
		int salary=resultSet.getInt("salary");
		Employee employee=new Employee(id,name,deptt,design,salary);
		return employee;
	}

}
