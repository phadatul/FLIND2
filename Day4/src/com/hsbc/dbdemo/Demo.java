package com.hsbc.dbdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
	public static void main (String []args) {
		
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			
			Connection con = DriverManager.getConnection("jdbc:derby:kapildb;create=true");
			Statement st = con.createStatement();
			st.execute("create table employee(empid int,name varchar(50),salary int)");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
