package com.oopsassign;

public class TestCheckout {
public static void main(String[] args) {
	Candy candy = new Candy("Orange",250);
	Cookie cookie= new Cookie("Coconut",5);
	IceCream iceCream= new IceCream("Vanilla");
	
	DessertItem items[]= {candy,cookie,iceCream};
	Checkout c=new Checkout();
	c.addItems(items);
	
}
}
