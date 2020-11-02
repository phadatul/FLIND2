package com.example.helloworldspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {
	@Bean
	public Repository<Employee> getEmployeeRepository() {
		EmployeeRepository repository = new EmployeeRepository();
		return repository;
	}
}
