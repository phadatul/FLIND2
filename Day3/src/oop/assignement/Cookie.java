package oop.assignement;

public class Cookie extends DessertItem {
	private double units, price_dozen;
	
	

	public Cookie() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Cookie(String name,double units) {
		super(name);
		this.units=units;
		this.price_dozen=120;
	}



	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return (this.price_dozen/12)*this.units;
	}

}
