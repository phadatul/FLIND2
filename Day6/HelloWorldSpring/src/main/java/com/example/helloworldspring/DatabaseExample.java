package com.example.helloworldspring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseExample {
	public static void main(String[] args) {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			Connection conn = DriverManager.getConnection("jdbc:derby:mydb;create=true");
			
			Statement st = conn.createStatement();
            try {
                st.execute("CREATE TABLE employees(empid int, name varchar(50), salary double)");
                st.execute("INSERT INTO employees VALUES(1, 'abc', 99)");
                st.execute("INSERT INTO employees VALUES(5, 'pqr', 110)");
                st.execute("INSERT INTO employees VALUES(2, 'rst', 109)");

                PreparedStatement ps = conn.prepareStatement("INSERT INTO employees VALUES(?, ?, ?)");
                ps.setInt(1, 3);
                ps.setString(2, "QWE");
                ps.setDouble(3, 107.5);
                ps.execute();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }

            ResultSet rs = st.executeQuery("select * from employees");
            while (rs.next()) {
                System.out.println(rs.getInt("empid") + " " + rs.getString("name") + " " + rs.getDouble("salary"));
            }

            conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
