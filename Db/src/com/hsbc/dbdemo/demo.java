package com.hsbc.dbdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class demo {
	public static void main (String []args) {
		
//		try {
//			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
//			
//			Connection con = DriverManager.getConnection("jdbc:derby:kapildb;create=true");
//			Statement st = con.createStatement();
////			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?)");
////			ps.setInt(1,id);
////			ps.setString
//			
//			
//			
//			ResultSet rs = st.executeQuery("SELECT * FROM employee");
//			while(rs.next()) {
//				System.out.println(rs.getInt(1)+" "+rs.getString("name")+" "+rs.getInt(3));
//			}
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		controller c = new controller();
		ResultSet rs = c.display();
		try {
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString("name")+" "+rs.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
