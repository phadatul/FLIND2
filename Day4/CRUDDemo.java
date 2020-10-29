import java.util.*;
import java.sql.*;
import java.lang.reflect.*;

public class CRUDDemo {
    public CRUDDemo() throws ClassNotFoundException {
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:derby:mydb;create=true");
    }

    public boolean insert(Employee e) throws SQLException {
        Connection conn = getConnection();
        PreparedStatement ps = conn.prepareStatement("INSERT INTO employees VALUES (?, ?, ?)");
        ps.setInt(1, e.getEmpId());
        ps.setString(2, e.getName());
        ps.setDouble(3, e.getSalary());
        boolean success = ps.execute();
        conn.close();
        return success;
    }

    public boolean update(Employee e) throws SQLException {
        Connection conn = getConnection();
        PreparedStatement ps = conn.prepareStatement("UPDATE employees SET name = ?, salary = ? WHERE empid = ?");
        ps.setString(1, e.getName());
        ps.setDouble(2, e.getSalary());
        ps.setInt(3, e.getEmpId());
        boolean success = ps.execute();
        conn.close();
        return success;
    }

    public boolean delete(Employee e) throws SQLException {
        Connection conn = getConnection();
        PreparedStatement ps = conn.prepareStatement("DELETE FROM employees WHERE empid = ?");
        ps.setInt(1, e.getEmpId());
        boolean success = ps.execute();
        conn.close();
        return success;
    }

    public Employee get(int id) throws SQLException {
        Connection conn = getConnection();
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM employees WHERE empid = ?");
        ps.setInt(1, id);
        ResultSet result = ps.executeQuery();
        if (!result.next()) {
            conn.close();
            return null;
        }

        Employee e = new Employee(result.getInt("empid"), result.getString("name"), result.getDouble("salary"));
        conn.close();
        return e;
    }

    public List<Employee> getAll() throws SQLException {
        Connection conn = getConnection();
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM employees");
        ResultSet result = ps.executeQuery();

        List<Employee> list = new ArrayList<>();
        while (result.next()) {
            list.add(new Employee(result.getInt("empid"), result.getString("name"), result.getDouble("salary")));
        }

        conn.close();
        return list;
    }

    public static void main(String[] args) {
        try {
            CRUDDemo db = new CRUDDemo();

            {
                for (Employee e : db.getAll()) {
                    System.out.println(e);
                }
                System.out.println();
            }

            {
                Employee emp = new Employee(9, "rty", 182);
                db.insert(emp);
                emp = db.get(9);
                emp.setSalary(123);
                db.update(emp);
                for (Employee e : db.getAll()) {
                    System.out.println(e);
                }
                System.out.println();
            }

            {
                db.delete(db.get(9));
                for (Employee e : db.getAll()) {
                    System.out.println(e);
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
