
public class Candy extends DessertItem{
	private double weight , price;
	
	public Candy()
	{
		
	}

	public Candy(String name , double weight) {
		super(name);
		// TODO Auto-generated constructor stub
		this.weight = weight ; 
		this.price = 100;
	}
	
	public double getCost()
	{
		return this.weight/1000*this.price;
	}
	
	
}