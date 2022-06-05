package org.animals;

public class Lion {
	private int age;
	private String color;
	private int weight;
	
	public Lion(int age, String color, int weight) {
		super();
		this.age = age;
		this.color = color;
		this.weight = weight;
	}

	public boolean canClimb(int age){
		if(age>1) {
			return true;
		}else return false;
	}

	@Override
	public String toString() {
		return "Lion [age=" + age + ", color=" + color + ", weight=" + weight + "]";
	}

		
}

