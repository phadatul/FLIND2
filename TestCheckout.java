package com.hsbc.assignment;

public class TestCheckout {
	public static void main(String[] args) {
		Candy candy=new Candy("Orange", 250, 5);
		Cookie cookie=new Cookie("Coconut", 5, 10.0);
		IceCream iceCream=new IceCream("Vanilla");
		Sundae sundae=new Sundae("Vanilla with Chocolate",1.0);
		
		DessertItem items[]= {candy,iceCream,cookie,sundae};
		
		Checkout c=new Checkout();
		
		c.addItems(items);
		System.out.println(c);
		c.clear();
		System.out.println(c);
	}

}