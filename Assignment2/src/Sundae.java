
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
	public double costItem() {
		this.cost = super.costItem() + 50;
		return this.cost;
	}
	
}