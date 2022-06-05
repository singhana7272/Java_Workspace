package com.anamika.client;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.anamika.presentation.EmployeeCoursePresentation;

@SpringBootApplication(scanBasePackages = "com.anamika")
@EnableJpaRepositories(basePackages = "com.anamika.persistence")
@EntityScan(basePackages = "com.anamika.bean")
public class EmployeeCourseJpaApplication implements CommandLineRunner{
	
	@Autowired
	private EmployeeCoursePresentation employeeCoursePresentation;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeCourseJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner=new Scanner(System.in);
		while(true) {
			employeeCoursePresentation.showMenu();
			System.out.println("Enter your choice");
			int choice=scanner.nextInt();
			employeeCoursePresentation.performMenu(choice);
		}
		
	}

}
