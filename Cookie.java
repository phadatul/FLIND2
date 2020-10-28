package com.oopsassign;

public class Cookie extends DessertItem{
	private int no_of_cookies;
	private double price_per_dozen;
	public Cookie() {
    	
    }
    public Cookie(String name,int no_of_cookies)
    {
    	super(name);
    	this.no_of_cookies=no_of_cookies;
    	this.price_per_dozen=120;
    }
    
    @Override
    public double cost()
    {
    	return Math.round(this.price_per_dozen*this.no_of_cookies/12);
    }

}
