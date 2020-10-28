package OOPAssignment;

public class Sundae extends IceCream {
	
	private int costoftoppings;
	
	public Sundae() {
		
	}

	public Sundae(String name, int price, int costoftoppings) {
		super(name, price);
		// TODO Auto-generated constructor stub
		this.costoftoppings = costoftoppings;
	}

	@Override
	double returnCost() {
		// TODO Auto-generated method stub
		double price =  super.returnCost();
		
		return price+this.costoftoppings;
	}
	
	

}
