package com.main;

import org.animals.Deer;
import org.animals.Giraffe;
import org.animals.Lion;
import org.animals.Monkey;
import org.animals.Tiger;

public class ZooKeeper {

	public static void main(String[] args) {
	   Lion lion=new Lion(45,"browny orange",80);
	   Tiger tiger=new Tiger("dark orange",65,40);
	   Deer deer=new Deer("dark brown",60,40);
	   Monkey monkey=new Monkey(80,"brown",100);
	   Giraffe giraffe=new Giraffe("dark yellow",90,70,10);
	   
	   System.out.println(lion.toString());
	   System.out.println(lion.canClimb(80));
	   System.out.println(tiger.toString());
	   System.out.println(deer.toString());
	   System.out.println(deer.isHealthy(80));
	   System.out.println(monkey.toString());
	   System.out.println(monkey.canClimb(12));
	   System.out.println(giraffe.toString());
	   System.out.println(giraffe.isVegeterian("yellow"));
	   
	}
}
