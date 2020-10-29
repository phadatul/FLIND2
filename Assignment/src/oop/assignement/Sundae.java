package oop.assignement;

public class Sundae  extends IceCream{
	
	private double cost_toppings;

	public Sundae() {
		super();
		
	}

	public Sundae(String name) {
		super(name);
		this.cost_toppings=10;
		
	}
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost()+this.cost_toppings;
	}
	
	

}