package com.anamika.client;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.anamika.presentation.EmployeePresentation;

@SpringBootApplication(scanBasePackages = "com.anamika")
@EnableJpaRepositories(basePackages = "com.anamika.persistence")
@EntityScan(basePackages = "com.anamika.bean")
public class EmployeeJpaApplication implements CommandLineRunner  {
	@Autowired
	@Qualifier("employeePresentationImpl")
	private EmployeePresentation employeePresentation;

	public static void main(String[] args) {
//		ApplicationContext springContainer= 
				SpringApplication.run(EmployeeJpaApplication.class, args);
//		EmployeePresentation employeePresentation=(EmployeePresentation) springContainer.getBean("emploPresentation");
		
	
	}

@Override
public void run(String... args) throws Exception {
	while(true) {
		employeePresentation.showMenu();
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		employeePresentation.performMenu(choice);
	}
	
}



}
