package com.hsbc.flind2.assignment1;

public class Candy extends DessertItem {
	
	private double weight;
	
	public Candy() {
		super();		
	}
	
	public Candy(String dessertName, double weight) {
		super(dessertName);
		this.weight = weight;
	}

	@Override
	public double costOfItem() {
		double cost = this.weight*0.05;
		return cost;		
	}
	
	
	
}
