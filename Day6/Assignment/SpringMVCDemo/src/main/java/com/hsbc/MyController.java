package com.hsbc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

//	@RequestMapping(value = "greeting", method = RequestMethod.GET)
//	public ModelAndView greet(Integer value) {
//		System.out.println("Welcome here");
//		ModelAndView model = new ModelAndView();
//		model.setViewName("hello.jsp");
//		model.addObject("mygreeting","Welcome to the Spring MVC "+value);
//		return model;
//	}
//	
//	@RequestMapping(value = "data", method = RequestMethod.POST)
//	public ModelAndView printEmp(String ename, Integer empid,Integer salary) {
//		System.out.println("Bye bye...........");
//		ModelAndView model = new ModelAndView();
//		model.setViewName("welcome.jsp");
//		model.addObject("employee",new Employee(empid,ename,salary));
//		
//		return model;
//	}

	@RequestMapping(value = "addEmployee", method = RequestMethod.POST)
	public ModelAndView addEmp(Integer empid, String ename, Integer salary, Integer pincode, String city) {
		System.out.println("Add employee...........");
		ModelAndView model = new ModelAndView();
		model.setViewName("welcome.jsp");
		Employee emp = new Employee();
		Address address = new Address(pincode,city);
		emp.add(empid, ename, salary, address);
		model.addObject("add", "Added");

		return model;
	}
	
	@RequestMapping(value = "modifyEmployee", method = RequestMethod.POST)
	public ModelAndView updateEmp(Integer empid, String ename, Integer salary, Integer pincode,String city) {
		System.out.println("Modify employee...........");
		ModelAndView model = new ModelAndView();
		model.setViewName("welcome.jsp");
		Employee emp = new Employee();
		Address address = new Address(pincode,city);
		emp.modify(empid, ename, salary, address);
		model.addObject("modify", "Modified");

		return model;
	}
	
	@RequestMapping(value = "deleteEmployee", method = RequestMethod.POST)
	public ModelAndView updateEmp(Integer empid) {
		System.out.println("Deleting employee...........");
		ModelAndView model = new ModelAndView();
		model.setViewName("welcome.jsp");
		Employee emp = new Employee();
		emp.delete(empid);
		model.addObject("delete", "Deleted");

		return model;
	}
	
	@RequestMapping(value = "displayEmployee", method = RequestMethod.GET)
	public ModelAndView displayEmp() {
		System.out.println("Display employee...........");
		ModelAndView model = new ModelAndView();
		model.setViewName("welcome.jsp");
		Employee emp = new Employee();
		String values= emp.display();
		model.addObject("display",values);

		return model;
	}

}
