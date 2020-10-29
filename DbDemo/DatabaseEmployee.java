package DbDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseEmployee {
	public Connection con;
	Statement st;
	public DatabaseEmployee() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			this.con = DriverManager.getConnection("jdbc:derby:hsbc;create=true");
			
			this.st = con.createStatement();
			
			st.execute("create table employee(empid int, name varchar(50),salary int)");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("Table Already Exists");
		}
		 
		
		
		
	}

	public void insert(int id, String name, int salary) {
		
		try {
			PreparedStatement ps = this.con.prepareStatement("insert into employee values(?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, salary);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void update(int salary, int val) {
		try {
			PreparedStatement ps = this.con.prepareStatement("update employee set salary=? where empid=?");
			ps.setInt(1, salary);
			ps.setInt(2, val);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void select() {

		try {
			ResultSet rs = this.st.executeQuery("select * from employee");
			while(rs.next()) {
				System.out.println(rs.getInt("empid")+" "+rs.getString("name")+" "+rs.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
