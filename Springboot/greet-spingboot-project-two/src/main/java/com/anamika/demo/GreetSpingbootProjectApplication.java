package com.anamika.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.anamika.producer.GoodEvening;
import com.anamika.producer.GoodMorning;
import com.anamika.producer.Greet;

@SpringBootApplication(scanBasePackages = "com.anamika.producer")
public class GreetSpingbootProjectApplication implements CommandLineRunner{

	@Autowired
	@Qualifier("goodEvening")
	private Greet greet;
	
	@Bean
	public GoodMorning goodMorning() {
		return new GoodMorning("Anamika");
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(GreetSpingbootProjectApplication.class, args);
		
	}


	@Override
	public void run(String... args) throws Exception {
		greet.wish();
	}

}
