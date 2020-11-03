package com.hsbc.dao;
import com.hsbc.entity.Employee;

public class Test {
	public static void main(String[] args) {
		EmployeeDAOImpl repo = new EmployeeDAOImpl();

		Employee e1 = new Employee(31, "ABC", 57);
		Employee e2 = new Employee(23, "XYZ", 65);
		Employee e3 = new Employee(5, "LMN", 100);

		repo.addEmployee(e2);
		repo.addEmployee(e1);
		repo.addEmployee(e3);

		Employee newData = new Employee(7, "PQR", 200);
		repo.updateEmployee(e2, newData);

		System.out.println(repo.showAllEmployees());
		repo.deleteEmployee(e1);
		System.out.println(repo.showAllEmployees());
	}

}