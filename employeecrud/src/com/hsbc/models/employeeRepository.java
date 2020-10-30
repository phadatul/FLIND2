package com.hsbc.models;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.models.Employee;

public class employeeRepository {
	
	List<Employee> l = new ArrayList<Employee>();
//	static Employee e1 = new Employee("Kapil", 1, 150000);
	public static void main(String[] args) {
		employeeRepository repo = new employeeRepository();
		Employee e1 = new Employee(3, "Kapil", 150000);
		Employee e2 = new Employee(2, "Rahul", 160000);
		Employee e3 = new Employee(1, "Koustubh", 170000);
		
		
		repo.addEmployee(e2);
		repo.addEmployee(e1);
		repo.addEmployee(e3);
//		System.out.println(repo.showAllEmployees());
		repo.deleteEmployee(e1);
		System.out.println(repo.showAllEmployees());
	}
	public void addEmployee(Employee e) {
		l.add(e);

	}
	public void updateEmployee(Employee oldEmployee, Employee newEmployee) {
		l.set(l.indexOf(oldEmployee), newEmployee);

	}
	
	public void deleteEmployee(Employee e) {
		l.remove(e);

	}
	public List<Employee> showAllEmployees() {
		// TODO Auto-generated method stub
		return l;
	}
}
