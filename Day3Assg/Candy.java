package Day3Asg;

public class Candy extends DessertItem {
	
	private double weight;
	private double price;
	
	public Candy() {
		// TODO Auto-generated constructor stub
	}
	
	public Candy(String name, double weight)
	{
//		this.dessert = "Candy";
		super(name);
//		this.price = price;
		this.weight = weight;
		this.price = 100;
	}
	
	@Override
	public double findcost() {
		// TODOx Auto-generated method stub
		double d;
		d = this.price*this.weight/1000;
		return d;
	}
	
}
