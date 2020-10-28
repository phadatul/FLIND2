public abstract class DesertItem {
	
	private String itemName;
	
	public DesertItem() {
		
	}
	
	public DesertItem(String item) {
		this.itemName = item;
	}
	
	public abstract double getCost();
	
	public final String getName() {
		return itemName;
	}

}
