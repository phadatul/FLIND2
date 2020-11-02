package com.hsbc;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import ch.qos.logback.core.db.DriverManagerConnectionSource;

@Configuration
public class AppConfig {

	// Factory Method
	@Bean
	public Employee getEmployee() {
		return new Employee();
	}

	@Bean
	public Address getAddress() {
		return new Address();
	}
	
//	@Bean
//	public DriverManagerDataSource dataSource() {
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName("org.apache.derby.jdbc.EmbeddedDriver");
//		dataSource.setUrl("jdbc:derby:hsbc;create=true");
//		
//		return dataSource;
//	}
//	
//	@Bean
//	public JdbcTemplate jdbcTemplate(DriverManagerDataSource dataSource) {
//		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//		jdbcTemplate.execute("insert into employee value(1,'abc',10000)");
//		
//		return jdbcTemplate;
//		
//	}
	
	
}
