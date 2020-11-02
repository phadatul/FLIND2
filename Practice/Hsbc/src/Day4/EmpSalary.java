package Day4;

import java.util.Comparator;

public class EmpSalary implements Comparator<Employee>{

	public EmpSalary() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.salary-o2.salary;
	}

}
