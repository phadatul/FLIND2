import java.util.*;

public class Employee {
    private int empId;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(int empId, String name, double salary) {
        this();
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double salary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee[id= " + empId + "]";
    }

    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "A", 100));
        empList.add(new Employee(2, "B", 105));
        empList.add(new Employee(3, "C", 110));
        System.out.println(empList);
    }
}
