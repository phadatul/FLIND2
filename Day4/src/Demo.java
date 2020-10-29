import java.util.ArrayList;
import java.util.Collections;

public class Demo {
 public static void main(String[] args) {
	 ArrayList <Employee> al= new ArrayList<Employee>();
	 Employee e1 = new Employee(1, "abc", 99);
	 Employee e3 = new Employee(2, "pqr", 88);
	 Employee e2 = new Employee(4, "mno", 44);
	 al.add(e1);
	 al.add(e2);
	 al.add(e3);
	 System.out.println(al);
	 Collections.sort(al);
	 System.out.println(al);
	 EmpAgeComparator age = new EmpAgeComparator();
	 Collections.sort(al,age);
	 System.out.println(al);
	 
 }
}
