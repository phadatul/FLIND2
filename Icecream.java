
public class Icecream extends DessertItem{
	private double cost;
	
	public Icecream()
	{
		
	}
	
	public Icecream(String name)
	{
		super(name);
		this.cost = 10;
	}
	
	public double getCost()
	{
		return this.cost;
	}
	
}
