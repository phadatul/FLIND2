package Day3Asg;

public class IceCream extends DessertItem{
//	private int units;
	private double price;
	
	public IceCream() {
		// TODO Auto-generated constructor stub
	}
	
	public IceCream(String name)
	{
//		this.dessert = "Ice Cream";
		super("IceCream");
//		this.units = units;
		this.price = 50;
	}
	
	@Override
	public double findcost() {
		// TODO Auto-generated method stub
		double d;
		d = this.price;
		return d;
	}
	
}
