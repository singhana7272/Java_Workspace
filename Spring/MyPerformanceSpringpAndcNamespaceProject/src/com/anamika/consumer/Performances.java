package com.anamika.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anamika.producer.Performer;

public class Performances {

	public static void main(String[] args) {
//		ApplicationContext springContainer=new ClassPathXmlApplicationContext("perfomance.xml");
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("performer.xml");
		Performer performer=(Performer)springContainer.getBean("Shafi");
		
		performer.perform();
		
//		Performer performer1=(Performer)springContainer.getBean("Waqar");
//		performer1.perform();
//		
//		Performer performer2=(Performer)springContainer.getBean("Shalini");
		
//		Performer performer3=(Performer)springContainer.getBean("Shafi");
		
//		performer2.perform();
//		performer3.perform();

	}

}
