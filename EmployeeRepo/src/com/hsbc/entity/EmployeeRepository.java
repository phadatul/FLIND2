package com.hsbc.entity;
import java.util.*;  
public class EmployeeRepository {
	private int empid;
	private String empname;
	private int empsalary;
	
	public EmployeeRepository()
	{
		
	}
	public EmployeeRepository(int empid,String empname,int empsalary)
	{
		this.empid=empid;
		this.empname=empname;
		this.empsalary=empsalary;
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return empname;
	}
	public void setName(String name) {
		this.empname = name;
	}
	public int getSalary() {
		return empsalary;
	}
	public void setSalary(int salary) {
		this.empsalary = salary;
	}


	@Override
	public String toString() {
		return "[empid=" + empid + ", name=" + empname + ", salary=" + empsalary + "]";
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
		EmployeeRepository other = (EmployeeRepository) obj;
		if (empid != other.empid)
			return false;
		return true;
	}
	
}
