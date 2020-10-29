package com.hsbc.dbdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbDemo {
	
	public static void main(String[] args) {
		DbDemo db = new DbDemo();
		db.insertData(3, "sdc", 47);
		db.updateData(1, "Nikhil", 100);
	}
	
	public static void insertData(int id, String name, int salary) {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");						
			Connection con = DriverManager.getConnection("jdbc:derby:hsbcfl;create=true");
			Statement st = con.createStatement();
			st.execute("create table employee(empid int, name varchar(50),salary int)");
			st.execute("insert into employee values(1,'abc',50)");
			st.execute("insert into employee values(1,'def',60)");
			st.execute("insert into employee values(1,'pqr',70)");
			st.execute("insert into employee values(1,'xyz',80)");
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, salary);
			ps.execute();
			
			ResultSet rs = st.executeQuery("select * from employee");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString("name")+" "+rs.getInt(3));
			}			
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	}
	
	public static void updateData(int id, String name, int salary) {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");						
			Connection con = DriverManager.getConnection("jdbc:derby:hsbcfl;create=true");
			Statement st = con.createStatement();
			PreparedStatement ps = con.prepareStatement("update employee set salary=?, name = ? where empid=?");
			ps.setInt(1, salary);
			ps.setString(2, name);
			ps.setInt(3, id);
			ps.execute();
			
			ResultSet rs = st.executeQuery("select * from employee");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString("name")+" "+rs.getInt(3));
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
