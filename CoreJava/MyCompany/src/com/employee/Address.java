package com.employee;

public class Address {
     private int houseno;
     private String streetname;
     private String statename;
     private String countryname;
     private int pincode;
     
	public Address(int houseno, String streetname, String statename, String countryname, int pincode) {
		super();
		this.houseno = houseno;
		this.streetname = streetname;
		this.statename = statename;
		this.countryname = countryname;
		this.pincode = pincode;
	}

	
	public String toString() {
		return "Address [houseno=" + houseno + ", streetname=" + streetname + ", statename=" + statename
				+ ", countryname=" + countryname + ", pincode=" + pincode + "]";
	}
	
    
     
     
}
