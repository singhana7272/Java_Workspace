package com.anamika.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.anamika.producer.GoodEvening;
import com.anamika.producer.GoodMorning;
import com.anamika.producer.Greet;

@SpringBootApplication(scanBasePackages = "com.anamika.producer")
public class GreetSpingbootProjectApplication {

	@Bean
	public GoodMorning goodMorning() {
		return new GoodMorning("Anamika");
	}
	
	
	public static void main(String[] args) {
		ApplicationContext springContainer=SpringApplication.run(GreetSpingbootProjectApplication.class, args);
		Greet greet1=(Greet)springContainer.getBean("goodMorning");
		Greet greet2=(Greet)springContainer.getBean("goodEvening");
		greet1.wish();
		greet2.wish();
	}

}
