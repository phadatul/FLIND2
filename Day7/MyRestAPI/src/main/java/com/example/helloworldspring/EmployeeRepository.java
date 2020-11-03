package com.example.helloworldspring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeRepository implements Repository<Employee> {
	private final List<Employee> list = new ArrayList<>();

	@Override
	public void add(Employee e) {
		list.add(e);
	}
	
	@Override
	public Employee get(int id) {
		for (Employee e : list) {
			if (e.getId() == id) {
				return e;
			}
		}
		
		return null;
	}

	@Override
	public List<Employee> getAll() {
		return Collections.unmodifiableList(list);
	}
}
