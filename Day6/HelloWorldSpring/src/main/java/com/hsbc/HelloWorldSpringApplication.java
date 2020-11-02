package com.hsbc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloWorldSpringApplication {

	public static void main(String[] args) {
//		SpringApplication.run(HelloWorldSpringApplication.class, args);
//		
//		ApplicationContext context = null;
////		BeanFactory factory = null;
//		
//		Employee e = new Employee();
//		e.hello();

		ApplicationContext context = SpringApplication.run(HelloWorldSpringApplication.class, args);

		Employee e = context.getBean(Employee.class);
		e.setEmpId(1);
		e.seteName("Suraj");
		e.setSalary(99);

		Address a = context.getBean(Address.class);
		a.setCity("Noida");
		a.setPincode(201301);

		Address a2 = context.getBean(Address.class);
		a2.setCity("Delhi");
		a2.setPincode(110020);

		System.out.println(a);
		System.out.println(e);
		e.hello();

	}

}
