package DbDemo;

import java.sql.*;
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
		DbDemo db = new DbDemo();
		db.insertData(4, "mno", 102);
		
		
	}
}
