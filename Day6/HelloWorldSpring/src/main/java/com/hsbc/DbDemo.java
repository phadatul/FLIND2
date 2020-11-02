package com.hsbc;

import java.sql.*;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
public class DbDemo {

	public DbDemo() {
		// TODO Auto-generated constructor stub
	}
	public void insertData(int id, String name, int salary) {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			
			
			Connection con = DriverManager.getConnection("jdbc:derby:hsbc;create=true");
				
			Statement st = con.createStatement();
			
//			st.execute("create table employee(empid int, name varchar(50),salary int)");
//			st.execute("insert into employee values(1,'abc',99)");
			
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, salary);
			ps.execute();
			
			ResultSet rs = st.executeQuery("select * from employee");
			while(rs.next()) {
				System.out.println(rs.getInt("empid")+" "+rs.getString("name")+" "+rs.getInt(3));
			}
				
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.apache.derby.jdbc.EmbeddedDriver");
		dataSource.setUrl("jdbc:derby:hsbc;create=true");
		
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.execute("insert into employee values(2,'zxs',199)");
		jdbcTemplate.execute("select * from employee");
		System.out.println(jdbcTemplate.queryForList("select * from employee"));
//		DbDemo db = new DbDemo();
//		db.insertData(2, "xyz", 202);
		
//		Model - JAVA File
//		View - HTML/JS
//		Controller - Servlet
	}
}
