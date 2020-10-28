package OOPAssignment;

public class TestCheckOut {
	
	
	public static void main(String[] args) {
		DesertItem d1 = new Candy("Fudge",2000, 100);
		DesertItem d2 = new Cookie("Chocochip Cookie", 100, 40);
		DesertItem d3 = new IceCream("Vanilla Pint", 300);
		DesertItem d4 = new Sundae("Banana Split", 200, 60);
		
		DesertItem[] list = {d1,d2,d3,d4};
		
		//create checkout object
		CheckOut checkout = new CheckOut();
		
		//add all items to checkout
		checkout.cashRegister(list);
		
		//print number of items in checkout
		System.out.println("No.of items: " +checkout.numberOfItems()); 
		
		System.out.println();
		
		//print the bill - ie, print the item with its cost
		checkout.generateBill();
		
		System.out.println();
		
		//total cost of all items;
		System.out.println("Total Cost: "+checkout.totalCost());
		
		System.out.println();
		
		//clear cash register
		checkout.clearCashRegister();
		System.out.println("Cash Register Cleared");
		
		
		
		
		
	}

}
