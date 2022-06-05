package com.anamika.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anamika.config.CommunicationConfiguration;
import com.anamika.producer.Message;

public class MyConsumer {

	public static void main(String[] args) {
		
//		ApplicationContext springContainer= new ClassPathXmlApplicationContext("message.xml");
		
		ApplicationContext springContainer=new AnnotationConfigApplicationContext(CommunicationConfiguration.class);
		Message mail=(Message)springContainer.getBean("mail");
		Message sms=(Message)springContainer.getBean("sms");
		
		mail.send();
		sms.send();
		
		
	}

}
