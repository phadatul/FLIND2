package com.hsbc.Generics_Practice;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
	public static void main(String[] args) {
		
		ArrayList<Employee> arr = new ArrayList<Employee>();
		
		
		Employee e1 = new Employee(1, "David", 40000);
		Employee e2 = new Employee(2, "Patrick", 30000);
		Employee e3 = new Employee(3, "John", 50000);
		
		arr.add(e1);
		arr.add(e3);
		arr.add(e2);
		
		
		
		EmpSalaryComparator em = new EmpSalaryComparator();
		Collections.sort(arr, em);
	
		System.out.println(arr);
		
		EmpNameComparator emn = new EmpNameComparator();
		
		Collections.sort(arr, emn);

		System.out.println(arr);
		
		for(Employee e:arr)
			if(e.getEmpid()==(1))
				e.setSalary(e.getSalary()+1000);

		System.out.println(arr);
	}
	
	
	public void changeEmpSalary() {
		
	}

}
