package com.oopsassign;

public class Sundae extends IceCream{
	private double topping_cost;
	public Sundae() {
		
	}
	public Sundae(String name)
	{
		super(name);
		this.topping_cost=20;
	}
	@Override
	public double cost()
	{
		return Math.round(super.cost()+this.topping_cost);
	}

}
