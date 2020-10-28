package com.hsbc.abstractdemo;

public class Demo {
	public static void main(String[] args) {
		Elephant e = new Elephant();
		e.walk();
		e.eat();
		e.eatVeg();
		Human h = new Human();
		h.walk();
		h.eat();
		h.eatVeg();
		h.eatNonVeg();
	}
	
}
