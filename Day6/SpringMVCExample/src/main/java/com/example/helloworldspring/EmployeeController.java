package com.example.helloworldspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	@Autowired
	private ApplicationContext context;
	
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
	
	@RequestMapping(value="list-employees", method=RequestMethod.GET)
	public ModelAndView listEmployees() {
		ModelAndView modelview = new ModelAndView();
		modelview.setViewName("list-employee.jsp");
		modelview.addObject("list", context.getBean(EmployeeRepository.class).getAll());
		return modelview;
	}
	
	@RequestMapping(value="add-employee", method=RequestMethod.POST)
	public String addEmployee(int id, String name, int salary) {
		Employee e = new Employee(id, name, salary);
		Repository<Employee> repository = context.getBean(EmployeeRepository.class);
		repository.add(e);
		return "redirect:list-employees";
	}	
}
