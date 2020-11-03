package com.hsbc;

import java.util.*;

public class Employee {
	private int empid;
	private String ename;
	private int salary;

	public Employee() {
		// TODO Auto-generated constructor stub
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
		return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + "]" + "\n";
	}

	static HashMap<Integer, Employee> employeeMap;

	static {
		employeeMap = new HashMap<>();
	}

	public void addEmployee(Employee e) {
		employeeMap.put(empid, e);
	}

	public void addMultiEmployee(ArrayList<Employee> arr) {
		for (Employee e : arr)
			employeeMap.put(e.empid, e);
	}

	public void updateEmployee(Employee e) {
		employeeMap.put(empid, e);
	}

	public void deleteEmployee(int empid) {
		employeeMap.remove(empid);
	}

	public String displayEmployee(int empid) {
		if(!employeeMap.containsKey(empid))
			return "No employee with this Id";
		
		return employeeMap.get(empid).toString();
	}

	public String displayAllEmployee() {
		StringBuilder sb = new StringBuilder();
		for (int id : employeeMap.keySet())
			sb.append(employeeMap.get(id).toString());
		if(sb.length()==0)
			return "There are no employees";
		return sb.toString();
	}

}
