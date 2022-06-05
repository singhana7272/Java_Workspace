package org.animals;

public class Tiger {
   private String color;
   private int weight;
   private int age;
   
public Tiger(String color, int weight, int age) {
	super();
	this.color = color;
	this.weight = weight;
	this.age = age;
}

@Override
public String toString() {
	return "Tiger [color=" + color + ", weight=" + weight + ", age=" + age + "]";
}
   
   
}

