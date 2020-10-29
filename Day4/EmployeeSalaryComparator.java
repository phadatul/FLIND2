import java.util.*;

public class EmployeeSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.valueOf(e1.getSalary()).compareTo(e2.getSalary());
    }
}
