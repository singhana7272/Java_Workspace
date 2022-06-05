package com.anamika.demo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.anamika.presentation.EmployeePresentation;

@SpringBootApplication(scanBasePackages = "com.anamika")
public class SpringbootJdbcEmployeeProjectApplication implements CommandLineRunner{

	@Autowired
	private EmployeePresentation employeePresentation;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootJdbcEmployeeProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner=new Scanner(System.in);
		while(true) {
			employeePresentation.showMenu();
			System.out.println("Enter your choice");
			int choice=Integer.parseInt(scanner.nextLine());
			employeePresentation.performMenu(choice);
		}
	}
	
//	@Bean
//	public DriverManagerDataSource dataSource() {
//		DriverManagerDataSource ds=new DriverManagerDataSource();
//		ds.setDriverClassName("");
//		ds.setUrl("");
//		ds.setUsername("root");
//		ds.setPassword("admin");
//		return ds;
//	}
//
//	@Bean
//	public JdbcTemplate jdbcTemplate() {
//		return new JdbcTemplate(dataSource());
//	}
}
