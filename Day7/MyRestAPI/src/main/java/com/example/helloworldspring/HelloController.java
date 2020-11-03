package com.example.helloworldspring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(value="/")
	public String welcome() {
		return "Welcome";
	}
	
	@RequestMapping(value="/greet")
	public String greet(String name) {
		if (name == null) {
			name = "World";
		}
		
		return "Hello " + name;
	}
	
	@RequestMapping(value="/get-employee")
	public Employee getEmployee() {
		return new Employee(1, "ABCD", 100);
	}
	
	@RequestMapping(value="/list-employees")
	public List<Employee> listEmployees() {
		return new ArrayList<Employee>() {{
			add(new Employee(1, "ABC", 100));
			add(new Employee(2, "BCD", 105));
			add(new Employee(3, "CDE", 110));
		}};
	}
}
