package Assignment;

public class TestCheckout {

	public TestCheckout() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Checkout ch = new Checkout();
		DessertItem candy = new Candy("Candy", 200, 50);
		DessertItem cookie = new Cookie("Cookie", 4, 10);
		DessertItem icecream = new IceCream("IceCream", 200);
		DessertItem sundae = new Sundae("Sundae", 200, 20);
		ch.cashRegister(candy, cookie, icecream, sundae);
		System.out.println("No of Items: " + ch.getNumberOfItems());
		System.out.println("Total Cost: " + ch.totalCost());
		System.out.println(ch.getBill());
		ch.clearCashRegister();
		System.out.println(ch.getNumberOfItems());
	}

}
