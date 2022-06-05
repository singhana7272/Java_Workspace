package com.anamika.producer;

import org.springframework.stereotype.Component;

@Component
public class Singer implements Performer {

	private String song;

	public void setSong(String song) {
		this.song = song;
	}

	@Override
	public void perform() {
		System.out.println("Singer is singing " + song);

	}

}
