package com.hsbc.abstractdemo;

public class Elephant extends Animal implements Herbivorus{

	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Elephant eats");
		
	}

	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Elephant walks");
		
	}

	@Override
	public void eatVeg() {
		// TODO Auto-generated method stub
		System.out.println("Elephant eats veg");
		
	}

}
