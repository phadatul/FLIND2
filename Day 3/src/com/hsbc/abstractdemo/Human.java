package com.hsbc.abstractdemo;

public class Human extends Animal implements Herbivorus, Carnivorus {
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Human eats");
		
	}
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Human walks");
		
	}

	@Override
	public void eatNonVeg() {
		// TODO Auto-generated method stub
		System.out.println("Human eats veg");
		
	}

	@Override
	public void eatVeg() {
		// TODO Auto-generated method stub
		System.out.println("Human eats nonveg");
		
	}

	
	

	

}
