package com.hsbc.flind2.assignment1;

public class Sundae extends IceCream {
	
	private double toppingsCost;
	
	public Sundae() {
		super();
	}
	
	public Sundae(String dessertName, double costOfIceCream, double toppingsCost) {	
		super(dessertName, costOfIceCream);
		this.toppingsCost = toppingsCost;
	}
	
	@Override
	public double costOfItem() {
		return super.costOfItem() + toppingsCost;
	}
	

}
