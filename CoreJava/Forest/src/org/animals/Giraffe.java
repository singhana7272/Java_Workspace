package org.animals;


public class Giraffe {
     private String color;
     private int weight;
     private int age;
     private int height;
     
	public Giraffe(String color, int weight, int age, int height) {
		super();
		this.color = color;
		this.weight = weight;
		this.age = age;
		this.height = height;
	}
    
	public boolean isVegeterian(String color) {
		if(color=="yellow") {
			return true;
		}else return false;
	}

	@Override
	public String toString() {
		return "Giraffe [color=" + color + ", weight=" + weight + ", age=" + age + ", height=" + height + "]";
	}
     
	
     
}

