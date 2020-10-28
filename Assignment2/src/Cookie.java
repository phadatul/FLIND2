
public class Cookie extends DessertItem{
	
	private int units;
	private double cost;
	
	public Cookie(int units) {
		super("Cookie");
		this.units = units;
		
	}

	@Override
	public double costItem() {
		this.cost = units * (10/12);
		return this.cost;
	}
	
	@Override
	public String toString() {
		return "Cookie [cost=" + cost + "]";
	}
	
}