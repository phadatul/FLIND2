package com.hsbc.assignment;

public class Candy extends DessertItem{
	double weight;
	double pricePerKg;

	public Candy() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public Candy(String name) {
//		super(name);
//		// TODO Auto-generated constructor stub
//	}

	@Override
	public double costs() {
		// TODO Auto-generated method stub
		return (weight*pricePerKg/1000);
	}

	public Candy(String name, double weight, int pricePerKg) {
		super(name);
		this.weight = weight;
		this.pricePerKg = pricePerKg;
	}

}
