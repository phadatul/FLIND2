package com.hsbc.employee;

import java.util.Vector;

public class Employee {

	private int empid;
	private String ename;
	private int salary;
	//Vector v= new Vector();


	public Employee() {
		
	}
	

	public Employee(int empid, String ename, int salary) {
		
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		result = prime * result + i;
		result = prime * result + salary;
		result = prime * result + ((v == null) ? 0 : v.hashCode());
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
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		if (i != other.i)
			return false;
		if (salary != other.salary)
			return false;
		if (v == null) {
			if (other.v != null)
				return false;
		} else if (!v.equals(other.v))
			return false;
		return true;
	}

	


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + ", v=" + v + ", i=" + i + "]";
	}




	Vector v = new Vector();
	private int i;
	
	//Employee e = new Employee(1,"Harsh",457783);
	
	public void add(Employee e) {
		
		v.add(e);
	}
	
	public Vector delete(int i) {
		
		return (Vector) v.remove(i);
	}
	
	public Vector update() {
		
		return v;
	}
}
