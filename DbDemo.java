package com.dbdemo;

import java.sql.*;

public class DbDemo {
public static void main(String[] args)
{
	DbDemo d=new DbDemo();
	d.insertData(4, "ddd", 222);
	
}
public void insertData(int id,String name,int salary)
{
	try {

		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Connection con = DriverManager.getConnection("jdbc:derby:training;create=true");
		Statement st=con.createStatement();
		//st.execute("create table employee(empid int, name varchar(30),salary int)");
		//st.execute("insert into employee values(1,'abc',99)");
		//st.execute("insert into employee values(2,'bbc',100)");
		//st.execute("insert into employee values(3,'cbc',111)");
		PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3, salary);
		ps.execute();
		ResultSet res=st.executeQuery("select * from employee");
		while (res.next())
		{
			System.out.println(res.getInt(1)+" "+res.getString("name")+" "+res.getInt(3));
		}
		con.close();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}	
}
}
