package com.anamika.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.anamika.producer.Instrument;
import com.anamika.producer.Instrumentalist;
import com.anamika.producer.Performer;

@SpringBootApplication(scanBasePackages = "com.anamika.producer")
public class PerformanceSpingbootProjectApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer= SpringApplication.run(PerformanceSpingbootProjectApplication.class, args);
		Performer performer1=(Performer)springContainer.getBean("dancer");
		Performer performer2=(Performer)springContainer.getBean("juggler");
		Performer performer3=(Performer)springContainer.getBean("singer");
		performer1.perform();
		performer2.perform();
		performer3.perform();
		
		Instrument instrument1=(Instrument)springContainer.getBean("Tabla");
		instrument1.play();
		
//		Instrumentalist instrumentalist=new Instrumentalist(instrument);
	}

}
