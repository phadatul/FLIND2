package OOPAssignment;

abstract class DesertItem {
	
	String name;
	
	public DesertItem() {
		//super();
	}

	public DesertItem(String name) {
		//super();
		this.name = name;
	}
	
	abstract double returnCost();
	
	final String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "DesertItem:" + name + " ";
	}
	
	
	
	
	
}
