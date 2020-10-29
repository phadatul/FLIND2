package databasespractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDatabase {
	private String table_name;
	public EmployeeDatabase(String name) {
		this.table_name = name;
		this.createTable();
	}
	private void createTable() {
		Connection con = this.getConnected();
		try {
			String s = "create table "+this.table_name+"(id int,name varchar(20),salary int)";
			Statement st = con.createStatement();
			st.execute(s);
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void insertData(int id,String name,int salary) {
		Connection con = this.getConnected();
		PreparedStatement ps;
		try {
			String s = "insert into "+this.table_name+" values(?,?,?)";
			ps = con.prepareStatement(s);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, salary);
			ps.execute();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updateData(int id,String name) {
		Connection con = this.getConnected();
		PreparedStatement ps;
		try {
			String s = "update "+this.table_name+" set name = ? where id = ?";
			ps = con.prepareStatement(s);
			ps.setString(1, name);
			ps.setInt(2, id);
			ps.execute();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void updateData(int id,int salary) {
		Connection con = this.getConnected();
		PreparedStatement ps;
		try {
			String s = "update "+this.table_name+" set salary = ? where id = ?";
			ps = con.prepareStatement(s);
			ps.setInt(1, salary);
			ps.setInt(2, id);
			ps.execute();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void printTable() {
		Connection con = this.getConnected();
		try {
			Statement st = con.createStatement();
			String s = "select * from "+this.table_name;
			ResultSet res = st.executeQuery(s);
			while(res.next()) {
				System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void deletTable() {
		Connection con = this.getConnected();
		try {
			String s = "drop table "+this.table_name;
			Statement st = con.createStatement();
			st.execute(s);
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private Connection getConnected() {
		Connection con = null;
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			con = DriverManager.getConnection("jdbc:derby:hsbcfl;create=true");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
