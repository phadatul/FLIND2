package com.hsbc.assignment;

public class Sundae extends IceCream{
	double toppingsCost;
	
	public double costs() {
		return toppingsCost+super.cost;
	}

	public Sundae(String name, double toppingsCost) {
		super(name);
		this.toppingsCost = toppingsCost;
	}
}
