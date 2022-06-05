package com.anamika.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sujata.producer.Dancer;
import com.sujata.producer.Drum;
import com.sujata.producer.Guitar;
import com.sujata.producer.Instrument;
import com.sujata.producer.Instrumentalist;
import com.sujata.producer.Juggler;
import com.sujata.producer.Singer;
import com.sujata.producer.Tabla;

@Configuration
public class PerformerConfiguration {
	
	@Bean
	public Singer abc() {
		return new Singer("Gadi Wala Aya");
	}
	
	@Bean
	public Juggler Waqar() {
		Juggler juggler=new Juggler();
		juggler.setBalls(20);
		return juggler;
	}
	
	@Bean
	public Dancer Chetan() {
		return new Dancer("Tandav");
	}
	
	@Bean
	public Tabla tabla() {
		return new Tabla();
	}
	
	@Bean
	public Guitar guitar() {
		return new Guitar();
	}
	
	@Bean
	public Drum drum() {
		return new Drum();
	}
	
	@Bean
	public Instrumentalist Shafi() {
		Instrumentalist instrumentalist=new Instrumentalist();
		instrumentalist.setInstrument(guitar());
		return instrumentalist;
	}
}
