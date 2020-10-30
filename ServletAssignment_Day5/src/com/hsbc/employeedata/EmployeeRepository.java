package com.hsbc.employeedata;

import java.util.ArrayList;

public class EmployeeRepository {
	
	public static ArrayList<Employee> repo = new ArrayList<Employee>();
	
	
	public EmployeeRepository() {
		 
	}
	
	
	public static void addEMP(Employee e) {
		EmployeeRepository.repo.add(e);
		
	}
	
	public static void removeEMP(int id) {
		
		for(Employee e:EmployeeRepository.repo) {
			if(e.getEmpid()==id)
				EmployeeRepository.repo.remove(e);
		}
	}
	
	public static void update(int id, String name) {
		for(Employee e:EmployeeRepository.repo) {
			if(e.getEmpid()==id)
				e.setEname(name);
		}
		
	}
	
	public static String display()
	{
		return EmployeeRepository.repo.toString(); 
			
	}
	

}
