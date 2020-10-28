package Assignment;

public class IceCream extends DessertItem {
	int cost;

	public IceCream() {
		// TODO Auto-generated constructor stub
	}

	public IceCream(String name, int cost) {
		// TODO Auto-generated constructor stub
		super(name);
		this.cost = cost;
	}

	@Override
	public double costOfItem() {
		// TODO Auto-generated method stub
		return this.cost;
	}

}
