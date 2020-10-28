package com.oopsassign;

public class IceCream extends DessertItem{
	private double cost;
	public IceCream() {
    	
    }
    public IceCream(String name)
    {
    	super(name);
    	this.cost=50;
    }
    
    @Override
    public double cost()
    {
    	return this.cost;
    }
}
