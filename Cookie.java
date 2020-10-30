
public class Cookie extends DessertItem{
	private double units , price_dozen;
	
	public Cookie()
	{
		
	}
	
	public Cookie(String name , double units)
	{
		super(name);
		this.units = units;
		this.price_dozen = 100;
	}
	
	public double getCost()
	{
		return this.units/12*this.price_dozen;
	}
}
