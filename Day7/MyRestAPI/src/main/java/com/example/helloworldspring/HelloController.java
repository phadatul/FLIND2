package com.example.helloworldspring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String welcome() {
		return "Welcome";
	}
	
	@RequestMapping(value="/greet", method=RequestMethod.GET)
	public String greet(String name) {
		if (name == null) {
			name = "World";
		}
		
		return "Hello " + name;
	}
}
