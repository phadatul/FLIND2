
public abstract class DessertItem {
	
	private String name;
	

	public DessertItem() 
	{
	}


	public DessertItem(String name) 
	{
		this.name = name;
	}
	
	public abstract double getCost();
	
	public final String getName()
	{
		return this.name;
	}
	
}
