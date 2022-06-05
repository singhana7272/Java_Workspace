package com.vehicles;

public class Road {
	
	public Vehicle vehicles[];
	int i;
	
	public Road() {
		super();
		this.vehicles =new Vehicle[10];
		i = 0;
	}
	
	public void addVehicle(Vehicle vehicle) {
		if(i<10) {
		vehicles[i]=vehicle;
		i++;
		}
		else System.out.println("no more vehicles");
	}
	
    public void getList() {
		
		for(Vehicle v:vehicles) {
			if(v!=null) 
				System.out.println(v.toString());		
		  }
	}
	
	

}
