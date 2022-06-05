package com.employee;

public class Insurance {
    private String company;
    private int premium;
    private int amount;
    
	public Insurance(String company, int premium, int amount) {
		super();
		this.company = company;
		this.premium = premium;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Insurance [company=" + company + ", premium=" + premium + ", amount=" + amount + "]";
	}
	
    
}
