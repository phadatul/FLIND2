package Day3Asg;

import java.util.Arrays;

public class CheckOut {
	DessertItem cashRegister[];
	
	public CheckOut() {
		// TODO Auto-generated constructor stub
	}
	
	public void addItems(DessertItem items[])
	{
		cashRegister = items;
	}

	public int getNumofItems()
	{
		if(cashRegister == null) {
			System.out.println("Empty Cart");
			return 0;
		}
		else {
			return cashRegister.length;
		}
	}

	public void clearCart()
	{
		cashRegister =null;
	}
	
	public double getTotalCost() {
		if(cashRegister == null)
		{
			System.out.println("Empty Cart");
			return 0;
		}
		
		else {
			double c = 0.0;
			for(DessertItem i: cashRegister) {
				c += i.findcost();
			}
			return c; 
		}
	}

	@Override
	public String toString() {
		System.out.println("FINAL RECEIPT.....");
		String s = "";
		if (cashRegister == null) {
			System.err.println("CART IS EMPTY!!!!!!");
			return "";
		} else {

			for (DessertItem i : cashRegister) {
				s = s + i.name() + ":" + i.findcost() + "\n";
			}
			s = s + "Total Cost:" + this.getTotalCost();
			return s;
		}
	}
	
//	public double getTotalCost() {
//		if(cashRegister == null)
//		{
//			System.out.println("Empty Cart");
//			return 0;
//		}
//		
//		else {
//			double c = 0.0;
//			for(DessertItem i: cashRegister) {
//				c += i.findcost();
//			}
//			return c; 
//		}
//	}
}
