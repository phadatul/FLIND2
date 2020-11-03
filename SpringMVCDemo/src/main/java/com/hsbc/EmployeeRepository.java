package com.hsbc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
@Repository
public class EmployeeRepository {
	private static final Map<Integer,Employee> l = new HashMap<Integer,Employee>();
	static {
		initEmps();
		
	}
	private static void initEmps() {
		Employee emp1 = new Employee(1,"Kapil",15000);
		Employee emp2 = new Employee(2,"Rahul",16000);
		Employee emp3 = new Employee(3,"Koustubh",17000);
		l.put(emp1.getEmpid(), emp1);
		l.put(emp2.getEmpid(), emp2);
		l.put(emp3.getEmpid(), emp3);
	}
	
	
	
	
	
	public boolean insert(Employee e) {
		l.put(e.getEmpid(),e);
		return true;
//		System.out.println(l);
	}
	public void delete(int empid) {
		l.remove(empid);
	}
	public List<Employee> display() {
		Collection<Employee> c = l.values();
		List<Employee> list = new ArrayList<Employee>();
		list.addAll(c);
		return list;
		
		
	}

}
