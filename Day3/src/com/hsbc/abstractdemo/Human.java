package com.hsbc.abstractdemo;



public class Human extends Animal implements Carnivorus,Herbivorus{

	@Override
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
	public void eatVeg() {
		// TODO Auto-generated method stub
		System.out.println("SOme human are herbi");
		
	}

	@Override
	public void eatMeat() {
		// TODO Auto-generated method stub
		System.out.println("Some human are carnivorus");
		
	}

}
