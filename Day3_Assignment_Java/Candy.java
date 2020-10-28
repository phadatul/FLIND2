package Assignment;

public class Candy extends DessertItem{
	private int weight;
	private int price;
	public Candy() {
		// TODO Auto-generated constructor stub
	}
	public Candy(String name, int weight, int price) {
		super(name);
		this.weight=weight;
		this.price=price;
	}
	
	@Override
	public double costOfItem() {
		// TODO Auto-generated method stub
		double cost = (this.weight * this.price)/1000;
		return Math.round(cost);
	}

}
