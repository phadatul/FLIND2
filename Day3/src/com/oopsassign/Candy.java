package com.oopsassign;
public class Candy extends DessertItem{
		private double weight_in_gms;
		private double price_per_kg;
		
        public Candy() {
        	
        }
        public Candy(String name,double weight_in_gms)
        {
        	super(name);
        	this.weight_in_gms=weight_in_gms;
        	this.price_per_kg=100;
        }
        
        @Override
        public double cost()
        {
        	return Math.round(this.weight_in_gms*this.price_per_kg/1000);
        }
}
