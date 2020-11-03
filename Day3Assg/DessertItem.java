package Day3Asg;

public abstract class DessertItem {
	private String dessert;
	
	public DessertItem() {
		// TODO Auto-generated constructor stub
	}
	
	public DessertItem(String name){
		dessert = name;
	}
	
	public abstract double findcost();
	public final String name() {
		return this.dessert;
}
	
}
