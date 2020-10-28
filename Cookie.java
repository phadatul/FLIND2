package com.hsbc.assignment;

public class Cookie extends DessertItem{
	int number;
	double pricePerDozen;
	
	public Cookie(String name, int number, double pricePerDozen) {
		super(name);
		this.number = number;
		this.pricePerDozen = pricePerDozen;
	}

	public Cookie() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public Cookie(String name) {
//		super(name);
//		// TODO Auto-generated constructor stub
//	}

	@Override
	public double costs() {
		// TODO Auto-generated method stub
		return number*pricePerDozen/12;
	}

}
