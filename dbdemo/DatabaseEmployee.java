package com.hsbc.dbdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseEmployee {
	
	public Connection con;
	public Statement st;
	
	public DatabaseEmployee() {
		try {
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		con = DriverManager.getConnection("jdbc:derby:hsbcfl;create=true");
		
		st = con.createStatement();
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insert(int id, String name, int salary)
	{
		try {
			
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, salary);
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void select() {
		try {
			ResultSet rs = st.executeQuery("select * from employee");
		
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString("name")+ " "+ rs.getInt(3));
		}
		
		//con.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void update(int id, int salary) {
try {
			
			PreparedStatement ps = con.prepareStatement("update employee set salary=? where empid=?");

			ps.setInt(1, salary);
			ps.setInt(2, id);
			ps.execute();
//			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

		
}