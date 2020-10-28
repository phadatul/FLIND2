public class Candy extends DesertItem{
	
	private double weightInGrams;
	private double pricePerKg;
	
	public Candy(double weightInGrams, double pricePerKg) {
		super("Candy");
		this.weightInGrams = weightInGrams;
		this.pricePerKg = pricePerKg;
	}
	
	@Override
	public double getCost() {
		return weightInGrams*pricePerKg/1000;
	}
	
	
	
}
