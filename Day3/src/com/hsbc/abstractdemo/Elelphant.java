package com.hsbc.abstractdemo;

public class Elelphant extends Animal implements Herbivorus{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Elephant eats");
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Elephant walks");
		
	}

	@Override
	public void eatVeg() {
		System.out.println("Elephant is herbivorus");
		
	}

	

}
