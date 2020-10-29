package com.hsbc;

import java.util.Vector;
import java.util.Comparator;

public class Employee implements Comparable<Employee> {

	private int empid;
	private String ename;
	private int salary;
	//Vector v= new Vector();
	
	public Employee() {
		
	}
	

	public Employee(int empid, String ename, int salary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
	}


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
	
	
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + "]";
	}


	public int compareTo(Employee e) {
		
		if(this.empid > e.empid)
			return 1;
		else if (this.empid < e.empid)
			return -1;
		else
			return 0;
	}
	
	public int updateSalary(Employee e) {
		
		if(e.salary>30000)
			
			return e.salary= 40000;
		
		else
			
			return 0;
		
	}

	
}
