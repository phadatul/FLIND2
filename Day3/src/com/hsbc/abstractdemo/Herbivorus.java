package com.hsbc.abstractdemo;

public interface Herbivorus {
	
	
	public default void someTask() {
		System.out.println("Hello");
	};
	public abstract void eatVeg();

}
