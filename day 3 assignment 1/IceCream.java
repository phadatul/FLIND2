
public class IceCream extends DessertItem {
	
	private double cost;

	public IceCream() {
		super();
	}

	public IceCream(String name,double cost) {
		super(name);
		this.cost = cost;
	}
	
	public double getCost()
	{
		return this.cost;
	}
}
