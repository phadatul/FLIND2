package com.example.helloworldspring;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private int id;
	private String name;
	
	@Autowired
	private Address address;
	
	@Autowired
	private Dog dog;
	
	public Employee() {
		super();
	}
	
	public Employee(int id, String name, Address address) {
		this();
		setId(id);
		setName(name);
		setAddress(address);
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
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}
	
	public void greet() {
		System.out.println("Hello World");
	}

	@Override
	public String toString() {
		return "Employee (id=" + id + ", name=" + name + ", address=" + address + ", dog=" + dog + ")";
	}
}
