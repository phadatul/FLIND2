package OOPAssignment;

public class CheckOut {
	
	DesertItem[] allItems;
	
	
	public CheckOut() {
		
	}
	
	
	public void cashRegister(DesertItem... allItems)
	{
		this.allItems = allItems;
	}
	
	public void clearCashRegister()
	{
		this.allItems = null;
	}
	
	public int numberOfItems() {
		return this.allItems.length;
		
	}
	
	
	public double totalCost() {
		double totalcost = 0;
		for(DesertItem d:this.allItems) {
			totalcost = totalcost+d.returnCost();
		}
		return totalcost;
	}

	public void generateBill() {
		String val = "";
		System.out.println("TotalBill ---- ");
		for(DesertItem d:this.allItems) {
			System.out.println(d.toString() + "  Cost: "+d.returnCost());
		}
	}
}
