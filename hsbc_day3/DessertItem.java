package hsbc_day3;

abstract class DessertItem {
	public String name;
	
	public DessertItem(String name) {
		this.name = name;
	}
	abstract double ItemCost();
	final String getName() {
		return name;
	}
	
}
