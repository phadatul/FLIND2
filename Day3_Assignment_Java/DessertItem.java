package Assignment;

public abstract class DessertItem {
	public String name;
	
	public DessertItem() {
		
	}
	public DessertItem(String name) {
		this.name = name;
	}

	public final String nameOfItem() {
		return this.name;

	}
	
	@Override
	public String toString() {
		return "DessertItem : " + name + ", costOfItem : " + costOfItem();
	}
	public abstract double costOfItem();

}
