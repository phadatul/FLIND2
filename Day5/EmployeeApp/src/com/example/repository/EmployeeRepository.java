package com.example.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.models.Employee;

public class EmployeeRepository {
	private List<Employee> employeeList;
	private static EmployeeRepository instance;
	
	private EmployeeRepository() {
		employeeList = new ArrayList<Employee>();
	}
	
	public static EmployeeRepository getInstance() {
		if (instance == null) {
			instance = new EmployeeRepository();
		}
		
		return instance;
	}
	
	public void add(Employee e) {
		employeeList.add(e);
	}
	
	public void delete(int id) {
		int index = getEmployeeIndex(id);
		employeeList.remove(index);
	}
	
	private int getEmployeeIndex(int id) {
		int index = 0;
		for (Employee e : employeeList) {
			if (e.getId() == id) return index;
			++index;
		}
		return index;
	}

	public Employee get(int id) {
		for (Employee e : employeeList) {
			if (e.getId() == id) {
				return e;
			}
		}
		
		return null;
	}
	
	public List<Employee> getAll() {
		return employeeList;
	}
}
