package com.anamika.persistence;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.anamika.bean.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, String>{
//	@Transactional
//	@Modifying
//	@Query("select e.* from Employee e join Registrations r on e.id=r.employee_id where r.courseId=:cId")
//	public ArrayList<Employee> showAllEmployeesForSpecificCourse(@Param("cId") String courseId);
//	
	
}
