package com.hsbc.entity;

import java.util.*;

public class Employee {
	
	static HashMap<Integer,Employee> employee;
	private int empId;
	private String empName;
	private int salary;
	static {
		employee = new HashMap<>();
	}
	
	public Employee() {
		
	}
	public Employee(int empId, String empName, int salary) {
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	
	public void addUser(int empId, String empName, int salary) {
		Employee emp = new Employee(empId,empName,salary);
		employee.put(empId,emp);
	}
	
	public void updateUser(int empId, String empName, int salary) {
		Employee emp = new Employee(empId,empName,salary);
		employee.put(empId, emp);
	}
	
	public void deleteUser(int empId) {
		employee.remove(empId);
	}
	
	public String displayUser() {
		StringBuilder sb = new StringBuilder();
		for(int empId:employee.keySet()) {
			sb.append(employee.get(empId).toString());
			
		}
		return sb.toString();
	}
	
	@Override
	public String toString() {
		return "[empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]"+"\n";
	}
	

}
