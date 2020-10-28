public class IceCream extends DesertItem{
	
	private double cost;
	
	public IceCream() {
		
	}
	
	public IceCream(double cost) {
		super("Ice Cream");
		this.cost = cost;
	}
	
	@Override
	public double getCost() {
		return cost;
	}
	
	

}
