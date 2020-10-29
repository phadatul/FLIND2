package Day3Asg;

public class Sundae extends IceCream{
	private double CostofToppings;
	
	public Sundae() {
		// TODO Auto-generated constructor stub
	}
	
	public Sundae(String name)
	{
//		this.dessert = "Sundae";
//		this.units = units;
//		this.price = price;
		super(name);
		this.CostofToppings = 10; 
	}
	
	public double findcost() {
		// TODO Auto-generated method stub
		double d;
		d = super.findcost() + this.CostofToppings;
		return d;
	}
}
