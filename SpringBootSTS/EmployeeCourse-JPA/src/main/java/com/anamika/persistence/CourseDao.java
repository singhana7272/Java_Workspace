package com.anamika.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anamika.bean.Course;

@Repository
public interface CourseDao extends JpaRepository<Course, String>{

}
