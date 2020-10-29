package com.hsbc.dbdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class DbDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			
			Connection con= DriverManager.getConnection("jdbc:derby:hsbcfl;create=True");
			
			Statement st= con.createStatement();
			
			st.execute("create employee table(empid int, name varchar(30), salary int");
			st.execute("insert into employee values(1,'abc',99)");
			
			ResultSet rs= st.executeQuery("select * from employee");
			
			while(rs.next()) {
				
				System.out.println(rs.getInt(1) + " " + rs.getString("name") + " " + rs.getInt(3));
			}
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
