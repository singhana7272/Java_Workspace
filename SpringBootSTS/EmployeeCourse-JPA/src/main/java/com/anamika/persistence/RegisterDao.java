package com.anamika.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anamika.bean.Registrations;

@Repository
public interface RegisterDao extends JpaRepository<Registrations, Integer>{

}
