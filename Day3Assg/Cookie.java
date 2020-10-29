package Day3Asg;

public class Cookie extends DessertItem {

	private int units;
	private double price;
	
	public Cookie() {
		// TODO Auto-generated constructor stub
	}

	public Cookie(String name, int units) {
//		this.dessert = "Cookie";
		super(name);
		this.units = units;
//		this.price = price;
		this.price = 120;
	}

	@Override
	public double findcost() {
		// TODO Auto-generated method stub
		double d;
		d = this.units*this.price/12;
		return d;
	}

}
