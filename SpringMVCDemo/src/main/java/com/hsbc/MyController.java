package com.hsbc;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class MyController {
	@Autowired
	private EmployeeRepository employeerepository;
	@RequestMapping(value = "/display",method = RequestMethod.GET)
	public ModelAndView greet() {
		ModelAndView m = new ModelAndView();
		m.setViewName("list.jsp");
		
		List<Employee> list = employeerepository.display();
		
//		e.display();
		m.addObject("details",list);
		System.out.println("WELCOME HERE......");
		return m;
	}
	@RequestMapping(value = "data" , method = RequestMethod.POST)
	public ModelAndView data(Integer empid, String ename, Integer salary) {
		
		ModelAndView m = new ModelAndView();
		m.setViewName("list.jsp");
		Employee e = new Employee(empid,ename,salary);
		
		boolean s = employeerepository.insert(e);
		List<Employee> list = employeerepository.display();
		if(s) {
			System.out.println("BYE BYE......");

		}
				m.addObject("details",list);
		return m;
	}
	@RequestMapping(value = "/insert" , method = RequestMethod.GET)
	public ModelAndView insertform() {
		ModelAndView m = new ModelAndView();
		m.setViewName("insertpage.jsp");
		return m;
	}
	@RequestMapping(value = "/delete" , method = RequestMethod.GET)
	public ModelAndView deleteform() {
		ModelAndView m = new ModelAndView();
		m.setViewName("deletepage.jsp");
		return m;
	}
	@RequestMapping(value = "deleteemployee" , method = RequestMethod.POST)
	public ModelAndView deleteemployee(	Integer empid) {
		ModelAndView m = new ModelAndView();
		m.setViewName("list.jsp");
		employeerepository.delete(empid);
		List<Employee> list = employeerepository.display();
		m.addObject("details",list);
		return m;
	}
}
