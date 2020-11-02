package com.example.helloworldspring;

import java.sql.CallableStatement;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.CallableStatementCallback;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

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
		
		JdbcTemplate template = appContext.getBean(JdbcTemplate.class);
		SqlRowSet rs = template.queryForRowSet("select * from employees");
		while (rs.next()) {
            System.out.println(rs.getInt("empid") + " " + rs.getString("name") + " " + rs.getDouble("salary"));
        }
	}

}
