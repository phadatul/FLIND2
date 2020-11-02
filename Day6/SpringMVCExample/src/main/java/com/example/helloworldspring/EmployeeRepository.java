package com.example.helloworldspring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeRepository implements Repository<Employee> {
	private List<Employee> employeeList;
	
	public EmployeeRepository() {
		employeeList = new ArrayList<>();
	}
	
	public void add(Employee e) {
		employeeList.add(e);
	}
		
	public List<Employee> getAll() {
		return Collections.unmodifiableList(employeeList);
	}	
}
