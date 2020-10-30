package com.hsbc.dao;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.entity.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	List<Employee> list = new ArrayList<Employee>();

	@Override
	public void addEmployee(Employee e) {
		list.add(e);

	}

	@Override
	public void updateEmployee(Employee oldEmployee, Employee newEmployee) {
		list.set(list.indexOf(oldEmployee), newEmployee);

	}

	@Override
	public void deleteEmployee(Employee e) {
		list.remove(e);

	}

	@Override
	public List<Employee> showAllEmployees() {
		// TODO Auto-generated method stub
		return list;
	}

}
