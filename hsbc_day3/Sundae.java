package hsbc_day3;

public class Sundae extends IceCream{
	
	private double cost;
	
	public Sundae() {
		super("Sundae");
	}

	@Override
	public String toString() {
		return "Sundae [cost=" + cost + "]";
	}
	
	@Override
	public double ItemCost() {
		this.cost = super.ItemCost() + 50;
		return this.cost;
	}
}
