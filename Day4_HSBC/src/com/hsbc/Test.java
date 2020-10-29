package com.hsbc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Vector v= new Vector();
		v.add("hi");
		v.add("hello");
		v.add("hey");
		
		Collections.sort(v);
		System.out.println(v);*/
		
		/*Vector<String> v= new Vector<String>();
		v.add("hi");
		v.add("hello");
		v.add("hey");
		
		Collections.sort(v);
		System.out.println(v);*/
		
		ArrayList<Employee> a1 = new ArrayList<Employee>();
		
		Employee e1 = new Employee(1,"Ram",45788);
		Employee e2 = new Employee(2,"Abhas",30000);
		Employee e3 = new Employee(3,"Anurag",56999);
		
		//EmpSalaryComparator sal = new EmpSalaryComparator();
		//Collections.sort(a1,sal);
		e1.updateSalary(e1);
		System.out.println(e1);
		
		
		
		
		
		
	}

}
