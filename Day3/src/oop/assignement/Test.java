package oop.assignement;

public class Test {
	public static void main(String[] args) {
		Candy candy=new Candy("Orange", 250);
		Cookie cookie=new Cookie("Coconut", 5);
		IceCream iceCream=new IceCream("Vanilla");
		Sundae sundae=new Sundae("Vanilla with Chocolate");
		
		DessertItem items[]= {candy,iceCream,cookie,sundae};
		
		Checkout c=new Checkout();
		
		c.addItems(items);
		System.out.println(c);
		c.clearCart();
		System.out.println(c);
	}

}
