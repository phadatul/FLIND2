package Assignment;

public class Sundae extends IceCream {
	int costOfTopping;

	public Sundae(String name, int price, int costOfTopping) {
		// TODO Auto-generated constructor stub
		super(name, price);
		this.costOfTopping = costOfTopping;
	}

	@Override
	public double costOfItem() {
		// TODO Auto-generated method stub
		return super.cost + this.costOfTopping;
	}

}
