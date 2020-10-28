package com.hsbc.flind2.assignment1;

public class IceCream extends DessertItem {
	
	private double costOfIceCream;
	
	public IceCream() {
		super();
	}
	
	public IceCream(String dessertName, double costOfIceCream ) {
		super(dessertName);
		this.costOfIceCream = costOfIceCream;
	}
	
	@Override
	public double costOfItem() {
		return this.costOfIceCream;
	}
	
	

}
