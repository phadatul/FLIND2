
public class Cookie extends DessertItem 
{
	private double num;
	private double price;
	
	public Cookie() {
		super();
	}

	public Cookie(String name,double num,double price) {
		super(name);
		this.num = num;
		this.price=price;
	}
	
	public double getCost() {
		return ((price/12)*num);
	}	
}
