package com.hsbc.employee;

import java.util.Vector;

public class EmployeeRepositoryImpl implements EmployeeRepository {

	Vector v= new Vector();
	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		v.add(e);
	}

	@Override
	public void updateEmployee(Employee oldEmployee, Employee newEmployee) {
		// TODO Auto-generated method stub
		v.set(v.indexOf(oldEmployee), newEmployee);
	}

	@Override
	public void deleteEmployee(Employee e) {
		// TODO Auto-generated method stub
		v.remove(e);
	}

	@Override
	public Vector displayEmployee() {
		// TODO Auto-generated method stub
		return v;
	}


	
	
}
