package com.anamika.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.anamika.producer.Mail;
import com.anamika.producer.SMS;

@Configuration
@ComponentScan(basePackages="com.anamika.producer")
public class CommunicationConfiguration {
	

}
