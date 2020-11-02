package Assignment;

public class Cookie extends DessertItem {
	private int unit;
	private int price;

	public Cookie() {
		// TODO Auto-generated constructor stub
	}

	public Cookie(String name, int unit, int price) {
		super(name);
		this.unit = unit;
		this.price = price;
	}

	@Override
	public double costOfItem() {
		// TODO Auto-generated method stub
		double cost = (this.unit + this.price) / 12;
		return Math.round(cost);
	}

}
