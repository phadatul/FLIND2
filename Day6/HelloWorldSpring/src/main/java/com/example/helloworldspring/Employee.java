package com.example.helloworldspring;

public class Employee {
	private int id;
	private String name;
	
	public Employee() {
		super();
	}
	
	public Employee(int id, String name) {
		this();
		setId(id);
		setName(name);
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void greet() {
		System.out.println("Hello World");
	}
}