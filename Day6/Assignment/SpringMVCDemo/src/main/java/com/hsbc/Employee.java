package com.hsbc;

import java.util.HashMap;

public class Employee {

	private int empid;
	private String ename;
	private int salary;
	private Address address;
	static HashMap<Integer,Employee> empAll;
	static {
		empAll = new HashMap<Integer, Employee>();
	}
	
	public Employee() {
	
	}

	public Employee(int empid, String ename, int salary, Address address) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
		this.address = address;
	}
	
	public void add(int empid,String ename, int salary, Address address) {
		Employee e = new Employee(empid,ename,salary,address);
		empAll.put(empid, e);
	}
	
	public void modify(int empid, String ename, int salary, Address address) {
		Employee e = new Employee(empid,ename,salary,address);
		empAll.put(empid, e);
	}
	
	public void delete(int empid) {
		empAll.remove(empid);
	}
	
	public String display() {
		StringBuilder sb = new StringBuilder();
		for(int e:empAll.keySet()){
			Employee emp = empAll.get(e);
			sb.append(emp.toString());
		}
		return sb.toString();
	}
	

	@Override
	public String toString() {
		return "[empid=" + empid + ", ename=" + ename + ", salary=" + salary + ", address=" + address + "] \n";
	}
	

}
