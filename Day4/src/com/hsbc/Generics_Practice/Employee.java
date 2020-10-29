package com.hsbc.Generics_Practice;

public class Employee implements Comparable<Employee>{
	
	private int empid;
	private String ename;
	private int salary;
	
	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee() {
		
	}
	
	public Employee(int empid, String ename, int salary)
	{
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "ID:" + empid + ", Name:" + ename + ", Salary:" + salary;
	}
	
	@Override
	public int compareTo(Employee e)
	{
		if(this.empid>e.empid)
			return 1;
		else if(this.empid<e.empid)
			return -1;
		else
			return 0;
	}
	
	

}
