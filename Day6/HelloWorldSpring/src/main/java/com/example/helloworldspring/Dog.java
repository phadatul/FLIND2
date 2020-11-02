package com.example.helloworldspring;

public class Dog {
	private String name;
	
	public Dog() {
		super();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void greet() {
		System.out.println("Bow Bow!");
	}
	
	@Override
	public String toString() {
		return "Dog (name=" + name + ")";
	}
}
