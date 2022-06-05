package org.animals;

public class Deer {
   private String color;
   private int weight;
   private int age;
   
public Deer(String color, int weight, int age) {
	super();
	this.color = color;
	this.weight = weight;
	this.age = age;
}
   

public boolean isHealthy(int weight) {
	   if(weight>65){
		   return true;
	   }else return false;
   }

@Override
public String toString() {
	return "Deer [color=" + color + ", weight=" + weight + ", age=" + age + "]";
}
   
   
}

