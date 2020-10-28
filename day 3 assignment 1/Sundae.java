
public class Sundae extends IceCream{
	
	private double topping_cost;

	public Sundae() {
		super();
	}

	public Sundae(String name,double cost,double topping_cost) {
		super(name,cost);
		this.topping_cost = topping_cost;
		// TODO Auto-generated constructor stub
	}
	
	public double getCost()
	{
		return super.getCost()+this.topping_cost;
	}
}
