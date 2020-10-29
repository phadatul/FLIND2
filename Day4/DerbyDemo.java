import java.lang.reflect.*;
import java.sql.*;

public class DerbyDemo {
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
            } catch (SQLException e) {
            }

            ResultSet rs = st.executeQuery("select * from employees");
            while (rs.next()) {
                System.out.println(rs.getInt("empid") + " " + rs.getString("name") + " " + rs.getDouble("salary"));
            }

            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
