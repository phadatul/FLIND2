

public abstract class DessertItem {

	public DessertItem() {
		
	}
	
	public String name;
	
	public DessertItem(String name) {
		
		this.name= name;
	}
	
	public abstract double costItem();
		
	final String getName() {
		
		return this.name;
	}
	
}
