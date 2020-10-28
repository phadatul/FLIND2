package hsbc_day3;

public class Candy extends DessertItem{

	private double weight;
	public double Cost;
	
	public Candy(double weight) {
		super("Candy");
		this.weight = weight;
	}

	public double ItemCost() {
		this.Cost = weight*50;
		return Cost;
	}
	@Override
	public String toString() {
		return "Candy [Cost=" + Cost + "]";
	}
	
}
