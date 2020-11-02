package com.hsbc.entities;

public class Employee {
	
	private int empid;
	private String empName;
	private int basicSalary;

	
	public Employee() {
		
	}
	
	
	public Employee(int empid, String empName, int basicSalary) {
		this.empid = empid;
		this.empName = empName;
		this.basicSalary = basicSalary;
	}
	
	
	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getBasicSalary() {
		return basicSalary;
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


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", basicSalary=" + basicSalary + "]";
	}


	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}



	
	public void printDetails() {
		System.out.println("ID: " + this.empid);
		System.out.println("Name: " + this.empName);
	}
	
}
