package com.example.helloworldspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloWorldSpringApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(HelloWorldSpringApplication.class, args);
		
		Employee employee = appContext.getBean(Employee.class);
		employee.greet();
		
		Dog dog = appContext.getBean(Dog.class);
		dog.setName("TM");
		dog.greet();
		
		Address address = appContext.getBean(Address.class);
		address.setCity("KT");
		address.setPinCode("110022");
		System.out.println(address);
		
		System.out.println(employee);
	}

}
