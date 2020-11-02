package Day4;

import java.util.Comparator;

public class EmpName implements Comparator<Employee>{

	public EmpName() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.empName.compareTo(o2.empName);
	}

}
