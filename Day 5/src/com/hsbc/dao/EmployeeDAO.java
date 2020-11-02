package com.hsbc.dao;

import java.util.List;

import com.hsbc.entities.Employee;

public interface EmployeeDAO {
	
	public abstract void addEmployee(Employee e);
	
	public abstract void editEmployee(Employee newEmployee, Employee oldEmployee);
	
	public abstract void deleteEmployee(Employee e);
	
	public abstract List<Employee> showAllEmployes();
	
}
