package com.example.demo;
import org.springframework.beans.factory.BeanFactory;
//import org.springframework.stereotype.Component;
//@Component
public class Employee {
	private int empid,salary;
	private String ename;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, int salary, String ename) {
		super();
		this.empid = empid;
		this.salary = salary;
		this.ename = ename;
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

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", salary=" + salary + ", ename=" + ename + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		result = prime * result + salary;
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
		if (salary != other.salary)
			return false;
		return true;
	}
	
	public void hello()
	{
		System.out.println("HELLO TEST METHOD");
	}
}
