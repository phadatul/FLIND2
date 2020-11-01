package employeepractice;

import java.util.ArrayList;
import java.util.List;

public class EmployeeImplementation implements EmployeeInterface {
	List<Employee> arr = new ArrayList<>();

	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		arr.add(e);

	}

	@Override
	public void updateEmployee(Employee oldEmployee, Employee newEmployee) {
		// TODO Auto-generated method stub
		arr.set(arr.indexOf(oldEmployee), newEmployee);
	}

	@Override
	public void deleteEmployee(Employee e) {
		// TODO Auto-generated method stub
		arr.remove(e);

	}

	@Override
	public void displayEmployees() {
		// TODO Auto-generated method stub
		System.out.println(arr);
	}

}
