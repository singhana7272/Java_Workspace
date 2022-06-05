package com.anamika.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.anamika.producer.Mail;
import com.anamika.producer.SMS;

@Configuration
public class CommunicationConfiguration {
	
	@Bean
	public Mail mail() {
		Mail mail=new Mail();
		mail.setSenderEmail("preeti@gmail.com");
		mail.setReceiverEmail("piyu@gmail.com");
		return mail;
	}
	
	@Bean
	public SMS sms() {
		SMS sms=new SMS(7887244267l,7652092293l);
		return sms;
	}
}
