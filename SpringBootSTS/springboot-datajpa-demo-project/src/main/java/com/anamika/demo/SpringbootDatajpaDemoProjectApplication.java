package com.anamika.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.anamika.bean.Student;
import com.anamika.persistence.StudentDao;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.anamika.persistence")
@EntityScan(basePackages = "com.anamika.bean")
public class SpringbootDatajpaDemoProjectApplication implements CommandLineRunner{

	@Autowired
	private StudentDao studentDao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDatajpaDemoProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student student1=new Student("AAAA", "Associate", "IT", 35000);
		Student student2=new Student("BBBB", "Sr. Associate", "IT", 35000);
		Student student3=new Student("CCCC", "Jr. Associate", "IT", 35000);
		Student student4=new Student("DDDD", "Manager", "IT", 35000);
		studentDao.save(student1);
		studentDao.save(student2);
		studentDao.save(student3);
		studentDao.save(student4);
		
	}

}