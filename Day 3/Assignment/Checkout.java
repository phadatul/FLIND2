package com.hsbc.flind2.assignment1;

import java.util.Arrays;

public class Checkout {
	private DessertItem listOfItems[];	

	public void addItems(DessertItem listOfItems[]) {
		this.listOfItems = listOfItems;
	}

	public void clearCart() {
		listOfItems = null;
	}

	public int getNumberOfItems() {
		if (this.listOfItems == null) {
			System.out.println("Cart is empty. Please add some items");
			return 0;
		} else
			return listOfItems.length;
	}

	public double totalCostOfItems() {
		if (this.listOfItems == null) {
			System.out.println("Cart is empty. Please add some items");
			return 0;
		} else {
			double cost = 0;
			for (DessertItem i : listOfItems) {
				cost = cost + i.costOfItem();
			}
			return cost;
		}
	}

	@Override
	public String toString() {
		System.out.println("-------RECEIPT---------");
		if (listOfItems == null) {
			System.out.println("Cart is empty. Please add some items");
			return "";
		} else {
			String s = "";
			for (DessertItem i : listOfItems) {
				s = s + "Name : " + i.nameOfDessert() + ", Cost of Item : " + i.costOfItem() + "\n";
			}
			s = s + "Total Cost of all Items : " + this.totalCostOfItems();
			return s;
		}
	}

}
