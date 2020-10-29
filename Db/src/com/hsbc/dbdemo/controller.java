package com.hsbc.dbdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class controller {
	Statement st = null;
	Connection con = null;
	
	public controller() {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			con = DriverManager.getConnection("jdbc:derby:kapildb;create=true");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			try {
				st = con.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
	
	
	public ResultSet display() {
		ResultSet rs = null;
		try {
			rs = st.executeQuery("SELECT * FROM employee");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	public int insert(int empid, String name, int salary) {
		try {
			PreparedStatement ps = con.prepareStatement("insert into employee (empid,name,salary) values(?,?,?)");
			ps.setInt(1, empid);
			ps.setString(2, name);
			ps.setInt(3, salary);
			return ps.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
//		return false;
	}
	
	public boolean update(int empid, String name, int salary) {
		try {
			PreparedStatement ps = con.prepareStatement("update employee set salary = ?, name = ? where empid = ?");
			ps.setInt(1, salary);
			ps.setString(2, name);
			ps.setInt(3, empid);
			return ps.execute();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	

}
