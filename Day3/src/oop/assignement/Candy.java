package oop.assignement;

public class Candy extends DessertItem{
	
	private double weight_gms,price_kg;
	
	public Candy() {
		// TODO Auto-generated constructor stub
	}
	

	public Candy(String name, double weight_gms) {
		super(name);
		this.weight_gms = weight_gms;
		this.price_kg=100;
	}


	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return (this.price_kg/1000)*this.weight_gms;
	}

}
