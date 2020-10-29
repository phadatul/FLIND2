
public class Sundae extends Icecream{
	private double topings;
	
	public Sundae()
	{
		
	}
	
	public Sundae(String name , double topings)
	{
		super(name);
		this.topings = topings;
	}
	
	public double getCost()
	{
		return super.getCost() + this.topings;
	}
}
