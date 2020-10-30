package com.hsbc.models;

public class Employee {
	private String name;
	private int empid;
	private int salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String name,  int salary) {
		super();
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	
public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	//	public static void main(String[] args) {
//		
//	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return super.toString();
		return name+" "+empid+" "+salary;
//		System.out.println(name+" "+empid+" "+salary);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empid != other.empid)
			return false;
		return true;
	}
	
}
