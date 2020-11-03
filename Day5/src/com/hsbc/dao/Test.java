package com.hsbc.dao;

import com.hsbc.entity.Employee;

public class Test {
	public static void main(String[] args) {
		EmployeeDAOImpl repo = new EmployeeDAOImpl();

		Employee e1 = new Employee(78, "AMIT", 99);
		Employee e2 = new Employee(34, "pooja", 89);
		Employee e3 = new Employee(1, "Abhijeet", 91);

		repo.addEmployee(e2);
		repo.addEmployee(e1);
		repo.addEmployee(e3);

		Employee newEmployee = new Employee(34, "Pooja", 111);
		repo.updateEmployee(e2, newEmployee);

		System.out.println(repo.showAllEmployees());
		repo.deleteEmployee(e1);
		System.out.println(repo.showAllEmployees());
	}

}
