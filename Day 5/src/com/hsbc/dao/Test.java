package com.hsbc.dao;

import com.hsbc.entities.Employee;

public class Test {
	public static void main(String[] args) {
		Repository repo = new Repository();

		Employee e1 = new Employee(78, "OJAS", 99);
		Employee e2 = new Employee(34, "SACHIN", 200);

		repo.addEmployee(e2);
		repo.addEmployee(e1);


		Employee newEmployee = new Employee(34, "ROHIT", 257);
		repo.editEmployee(e2, newEmployee);

		System.out.println(repo.showAllEmployes());
		repo.deleteEmployee(e1);
		System.out.println(repo.showAllEmployes());
	}

}