package employeepractice;

public interface EmployeeInterface {
	public abstract void addEmployee(Employee e);

	public abstract void updateEmployee(Employee oldEmployee, Employee newEmployee);

	public abstract void deleteEmployee(Employee e);

	public abstract void displayEmployees();

}
