package com.anamika.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.anamika.bean.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee,String> {
	@Transactional
	@Modifying
	@Query("update Employee set salary=:sal where id=:empId")
	public int updateSalary(@Param("empId") String empId,@Param("sal") int salary);
}
