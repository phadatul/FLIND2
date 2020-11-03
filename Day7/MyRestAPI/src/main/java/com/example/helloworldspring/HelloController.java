package com.example.helloworldspring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Autowired
	private ApplicationContext context;
	
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
	public Employee getEmployee(int id) {
		return context.getBean(EmployeeRepository.class).get(id);
	}
	
	@RequestMapping(value="/create-employee", method=RequestMethod.POST)
	public Employee createEmployee(int id, String name, int salary) {
		Employee e = new Employee(id, name, salary);
		context.getBean(EmployeeRepository.class).add(e);
		return e;
	}
	
	@RequestMapping(value="/list-employees")
	public List<Employee> listEmployees() {
		return context.getBean(EmployeeRepository.class).getAll();
	}
}
