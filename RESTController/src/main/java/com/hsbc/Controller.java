package com.hsbc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping(value = "/")
	public String hello() {
		return "Hello from REST";
	}
	@PostMapping(value="/option" )
	public String helloagain() {
		return "Hello from REST another URL";
		}
	@GetMapping(value = "/getemp")
	public Employee getEmployee() {
		return new Employee(12,"ABCD",99000);
	}
	@GetMapping(value="/getall")
	public Employee getAllEmployee(){
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(5,"ABC", 89777));
		list.add(new Employee(4,"XYZ", 12345));
		list.add(new Employee(9,"PQR", 89767));
		return list.get(2);
	}
	@PostMapping(value="/emppost")
	public Employee helloPost(@RequestBody Employee e) {
		System.out.println("Hello this is the post method");
		return e;
	}
}
