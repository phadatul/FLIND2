package com.hsbc.flind2.assignment1;

public class TestCheckout {
	
	public static void main(String[] args) {
		Candy candy = new Candy("Eclairs", 100);
		Cookie cookie = new Cookie("Britannia", 40);
		IceCream icecream = new IceCream("Chocolate", 15);
		Sundae sundae = new Sundae("Vanilla",30,15);
		
		DessertItem items[] = {candy,cookie,icecream,sundae};	
		
		Checkout check = new Checkout();
		check.addItems(items);
		System.out.println(check);
		
	}
	
	

	


	

}
