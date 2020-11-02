package com.example.helloworldspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	@RequestMapping(value="employee-form", method=RequestMethod.GET)
	public ModelAndView employeeForm() {
		ModelAndView modelview = new ModelAndView();
		modelview.setViewName("employee_form.jsp");
		return modelview;
	}
	
	@RequestMapping(value="display-employee-data", method=RequestMethod.POST)
	public ModelAndView displayEmployeeData(int id, String name, int salary) {
		ModelAndView modelview = new ModelAndView();
		modelview.setViewName("display_employee_data.jsp");
		modelview.addObject("employee", new Employee(id, name, salary));
		return modelview;
	}
}
