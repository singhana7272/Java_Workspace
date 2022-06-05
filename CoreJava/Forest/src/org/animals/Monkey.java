package org.animals;

public class Monkey {
	private int age;
	private String color;
	private int weight;

	public Monkey(int age, String color, int weight) {
		super();
		this.age = age;
		this.color = color;
		this.weight = weight;
	}

	public String canClimb(int age) {
		if(age>5){
			return "Monkey can climb";
		}else return "Monkey can't climb";
	}

	@Override
	public String toString() {
		return "Monkey [age=" + age + ", color=" + color + ", weight=" + weight + "]";
	}
	
	
}
