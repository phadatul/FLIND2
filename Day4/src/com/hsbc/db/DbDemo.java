package com.hsbc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbDemo {
	
	public static void main(String[] args) {
		
//		DbDemo d = new DbDemo();
//		d.insertData(99, "Moira", 90000);
//		System.out.println();
//		d.insertData(99, "Joanna", 90000);
		
		DatabaseEmployee db = new DatabaseEmployee();
		//db.insert(99, "Roland", 7800);
		db.select();
		System.out.println();
		db.update(1,9000000);
		db.select();
		
//		try {
//			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
//			Connection con = DriverManager.getConnection("jdbc:derby:hsbcfl;create=true");
//			
//			Statement st = con.createStatement();
//			
//			//st.execute("create table employee(empid int,name varchar(50),salary int)");
//			st.execute("insert into employee values(1,'Alexis',1000)");
//			
//			ResultSet rs = st.executeQuery("select * from employee");
//			
//			while(rs.next()) {
//				System.out.println(rs.getInt(1)+" "+rs.getString("name")+ " "+ rs.getInt(3));
//			}
//			
//			con.close();
//			
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
	}
	
	
	public void insertData(int id, String name, int salary)
	{
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			Connection con = DriverManager.getConnection("jdbc:derby:hsbcfl;create=true");
			
			Statement st = con.createStatement();
			
			//st.execute("create table employee(empid int,name varchar(50),salary int)");
			//st.execute("insert into employee values(1,'Alexis',1000)");
			
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, salary);
			ps.execute();
			ResultSet rs = st.executeQuery("select * from employee");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString("name")+ " "+ rs.getInt(3));
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

}
