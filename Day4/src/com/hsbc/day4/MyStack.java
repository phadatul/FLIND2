package com.hsbc.day4;

import java.util.ArrayList;

public class MyStack<Q> {
	
	ArrayList a = new ArrayList();
	
	
	public void push(int data) {
		a.add(data);
	}
	
	public int pop() {
		int aa = (int)a.remove(a.size()-1);
		return 0;
	}
	
	public Q popobj() {
		return (Q) a.remove(a.size()-1);
		
	}
	
	public void print() {
		System.out.println(a);
	}
	
	

}
