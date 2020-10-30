package com.hsbc.dao;

import java.util.List;

import com.hsbc.entity.Employee;

public interface EmployeeDAO {
	public abstract void addEmployee(Employee e);

	public abstract void updateEmployee(Employee oldEmployee,Employee newEmployee);

	public abstract void deleteEmployee(Employee e);

	public abstract List<Employee> showAllEmployees();

}
