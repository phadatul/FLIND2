package com.example.helloworldspring;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

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
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.apache.derby.jdbc.EmbeddedDriver");
		dataSource.setUrl("jdbc:derby:mydb;create=true");
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate getJdbctemplate() {
		JdbcTemplate template = new JdbcTemplate(getDataSource());
		return template;
	}
}
