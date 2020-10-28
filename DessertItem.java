package com.hsbc.assignment;

public abstract class DessertItem {
	String name="";

	public DessertItem() {
		super();
	}

	public DessertItem(String name) {
		super();
		this.name = name;
	}
	
	public abstract double costs();
	
	public final String name() {
		return name;
	}
}
