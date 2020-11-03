package com.example.helloworldspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Repository<Employee> getEmployeeRepository() {
		return new EmployeeRepository();
	}
}
