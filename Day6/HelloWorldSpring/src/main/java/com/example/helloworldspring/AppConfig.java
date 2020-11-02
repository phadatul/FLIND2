package com.example.helloworldspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Employee getEmployee() {
		return new Employee();
	}
	
	@Bean
	public Dog getDog() {
		return new Dog();
	}
	
	@Bean
	public Address getAddress() {
		return new Address();
	}
}
