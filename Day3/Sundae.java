public class Sundae extends IceCream {
	
	private double toppingsCost;
	
	public Sundae(double iceCreamCost, double toppingsCost) {
		super(iceCreamCost);
		this.toppingsCost = toppingsCost;
	}
	
	
	@Override
	public double getCost() {
		return this.toppingsCost + super.getCost();
	}

}
