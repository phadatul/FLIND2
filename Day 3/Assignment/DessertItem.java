package com.hsbc.flind2.assignment1;

public abstract class DessertItem {

	private String dessertName;

	public DessertItem() {
		super();
		this.dessertName = null;
	}

	public DessertItem(String dessertName) {
		super();
		this.dessertName = dessertName;
	}

	public abstract double costOfItem();

	public final String nameOfDessert() {
		return this.dessertName;
	}

}
