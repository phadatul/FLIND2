import java.util.*;

public class Employee implements Comparable<Employee> {
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

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee[id = " + empId + ", name = " + name + ", salary = " + salary + "]";
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.valueOf(empId).compareTo(other.empId);
    }

    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "X", 100));
        empList.add(new Employee(7, "Y", 105));
        empList.add(new Employee(5, "E", 110));
        empList.add(new Employee(2, "B", 99));

        Collections.sort(empList);
        System.out.println(empList);

        EmployeeSalaryComparator salaryComparator = new EmployeeSalaryComparator();
        Collections.sort(empList, salaryComparator);
        System.out.println(empList);

        EmployeeNameComparator nameComparator = new EmployeeNameComparator();
        Collections.sort(empList, nameComparator);
        System.out.println(empList);
    }
}
