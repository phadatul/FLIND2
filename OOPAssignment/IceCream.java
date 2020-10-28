package OOPAssignment;

public class IceCream extends DesertItem{
	private int price;
	
	public IceCream() {
		
	}
	
	
	public IceCream(String name, int price) {
		super(name);
		// TODO Auto-generated constructor stub
		this.price = price;
	}


	@Override
	double returnCost() {
		// TODO Auto-generated method stub
		return price;
	}
	

}
