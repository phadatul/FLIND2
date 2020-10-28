package com.hsbc.flind2.assignment1;

public class Cookie extends DessertItem {
	
	private double numberOfCookies;
	
	public Cookie() {
		super();
	}
	
	public Cookie(String dessertName, double numberOfCookies) {		
		super(dessertName);
		this.numberOfCookies = numberOfCookies;
	}
	
	@Override
	public double costOfItem() {
		double cost = (this.numberOfCookies*10)/12;
		return cost;
	}

}
