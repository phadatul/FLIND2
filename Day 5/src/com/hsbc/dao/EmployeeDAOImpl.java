package com.hsbc.dao;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.entity.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	List<Employee> list = new ArrayList<Employee>();

	public void addEmployee(Employee e) {
		list.add(e);

	}

	public void updateEmployee(Employee oldEmployee, Employee newEmployee) {
		list.set(list.indexOf(oldEmployee), newEmployee);

	}

	public void deleteEmployee(Employee e) {
		list.remove(e);

	}

	public List<Employee> showAllEmployees() {
		// TODO Auto-generated method stub
		return list;
	}

}