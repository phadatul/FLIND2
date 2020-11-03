package oop.assignement;

public class IceCream extends DessertItem {
	private double cost;
	
	

	public IceCream() {
		super();
		// TODO Auto-generated constructor stub
	}



	public IceCream(String name) {
		super(name);
		this.cost=50;
	}



	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return this.cost;
	}

}
