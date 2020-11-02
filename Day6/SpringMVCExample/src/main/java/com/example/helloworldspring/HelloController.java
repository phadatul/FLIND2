package com.example.helloworldspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(value="hello", method=RequestMethod.GET)
	public ModelAndView hello() {
		ModelAndView modelview = new ModelAndView();
		modelview.setViewName("hello.jsp");
		modelview.addObject("greeting", "Welcome to the Spring MVC");
		return modelview;
	}
	
	@RequestMapping(value="bye", method=RequestMethod.GET)
	public ModelAndView bye() {
		ModelAndView modelview = new ModelAndView();
		modelview.setViewName("bye.jsp");
		modelview.addObject("message", "Goodbye!");
		return modelview;
	}
}
