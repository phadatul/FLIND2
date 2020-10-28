
public class IceCream extends DessertItem{
	
	private int cost;
	
	public IceCream() {
		super("IceCream");
		
	}
	public IceCream(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return "IceCream [cost=" + cost + "]";
	}
	
	@Override
	public double costItem() {
		this.cost = 100;
		return this.cost;
	}
}