
public class Candy extends DessertItem 
{
	private double wt,price;

	public Candy() {
		super();
	}

	public Candy(String name,double wt,double price) 
	{
		super(name);
		this.wt = wt;
		this.price = price;
		// TODO Auto-generated constructor stub
	}
	
	public double getCost()
	{
		return (int)(wt*price*0.001);
	}	
}
