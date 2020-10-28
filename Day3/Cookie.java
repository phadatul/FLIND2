public class Cookie extends DesertItem{

	private double noOfUnits;
	private double pricePerDozen;
	
	public Cookie(double noOfUnits, double pricePerDozen) {
		super("Cookie");
		this.noOfUnits = noOfUnits;
		this.pricePerDozen = pricePerDozen;
	}
	
	@Override
	public double getCost() {
		return noOfUnits*pricePerDozen/12;
	}
	
}
