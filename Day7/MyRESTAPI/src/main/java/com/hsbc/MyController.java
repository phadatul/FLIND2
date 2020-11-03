package com.hsbc;

import java.util.*;

import javax.annotation.PostConstruct;
import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

//	@GetMapping(value = "/")
//	public String hello() {
//		return "Hello from my REST API";
//	}
//
//	@GetMapping(value = "/option")
//	public String anotherMethod() {
//		double data = Math.round(Math.random() * 10000000);
//		return "Other data from REST: " + data;
//	}
//
//	@GetMapping(value = "/getemp")
//	public Employee getEmployee() {
//		return new Employee(12, "ABC", 99000);
//	}
//
//	@GetMapping(value = "/getall")
//	public List<Employee> getAllEmployess() {
//		ArrayList<Employee> ar = new ArrayList<>();
//		ar.add(new Employee(9, "ABCD", 89999));
//		ar.add(new Employee(10, "PQRS", 99000));
//		ar.add(new Employee(12, "WXYZ", 780000));
//		return ar;
//	}
//
//	@PostMapping("/emppost")
//	public Employee helloPost(@RequestBody Employee e) {
//		System.out.println("Hello this is post method..........");
//		System.out.println(e);
//		return e;
//	}
//
//	@PutMapping("/empput")
//	public Employee helloPut(@RequestBody Employee e) {
//		System.out.println("Hello this is put method..........");
//		System.out.println(e);
//		return e;
//	}
//
//	@DeleteMapping("/empdelete")
//	public Employee helloDelete(@RequestBody Employee e) {
//		System.out.println("Hello this is delete method..........");
//		System.out.println(e);
//		return e;
//	}

	@PostMapping("/addEmployee")
	public int addEmployee(@RequestBody Employee e) {
		e.addEmployee(e);
		return 200;
	}
	
	@PostMapping("/addMultiEmployee")
	public int addMultiEmployee(@RequestBody ArrayList<Employee> arr) {
		Employee e = new Employee();
		e.addMultiEmployee(arr);
		return 200;
	}
	
	@PutMapping("/updateEmployee")
	public int updateEmployee(@RequestBody Employee e) {
		e.updateEmployee(e);
		return 200;
	}
	
	@GetMapping("/deleteEmployee")
	public int deleteEmployee(@RequestParam int empid) {
		Employee e = new Employee();
		e.deleteEmployee(empid);
		return 200;
	}
	
	@GetMapping("/displayEmployee/{empid}")
	public String displayEmployee(@PathVariable("empid") int empid) {
		Employee e = new Employee();
		return e.displayEmployee(empid);
	}
	
	@GetMapping("/displayAllEmployee")
	public String displayEmployee() {
		Employee e = new Employee();
		return e.displayAllEmployee();
	}
	
	

}
