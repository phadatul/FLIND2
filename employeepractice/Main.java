package employeepractice;

public class Main {
	public static void main(String[] args) {
		EmployeeImplementation e = new EmployeeImplementation();
		e.addEmployee(new Employee(1, "Jake Peralta", 90));
		e.addEmployee(new Employee(2, "Amy Santiago", 100));
		Employee e1 = new Employee(3,"Raymond Holt",30);
		e.addEmployee(new Employee(3,"Raymond Holt",30));
		e.addEmployee(new Employee(4,"Charles Boyle",90));
		e.displayEmployees();
		e.updateEmployee(new Employee(3,"Raymond Holt",30), new Employee(3,"Raymond Holt",120));
		e.displayEmployees();
		e.addEmployee(new Employee(5, "Rosa", 90));
		e.displayEmployees();
		e.deleteEmployee(new Employee(5, "Rosa", 90));
		e.displayEmployees();
	}
}
