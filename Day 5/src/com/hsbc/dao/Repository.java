package com.hsbc.dao;

import com.hsbc.entities.Employee;
import java.util.List;
import java.util.ArrayList;

public class Repository implements EmployeeDAO {
	
	List<Employee> list = new ArrayList<Employee> ();

	@Override
	public void addEmployee(Employee e) {
		list.add(e);
	}

	@Override
	public void editEmployee(Employee newEmployee, Employee oldEmployee) {
		list.set(list.indexOf(oldEmployee), newEmployee);
	}

	@Override
	public void deleteEmployee(Employee e) {
		list.remove(e);
	}

	@Override
	public List<Employee> showAllEmployes() {
		return list;
	}
	

}
