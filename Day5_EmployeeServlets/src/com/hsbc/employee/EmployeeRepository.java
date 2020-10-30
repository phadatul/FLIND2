package com.hsbc.employee;

import java.util.Vector;

public interface EmployeeRepository {

	public abstract void addEmployee(Employee e);
	public abstract void updateEmployee(Employee oldEmployee, Employee newEmployee);
	public abstract void deleteEmployee(Employee e);
	public abstract Vector displayEmployee();

	
}
