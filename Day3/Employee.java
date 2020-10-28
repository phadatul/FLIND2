/*
 * Example for overriding java.lang.Object method
 */
public class Employee {
	private int empId;
	private String name;
	
	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Id: " + empId + ", Name: " + name;
	}
	
	@Override
	public boolean equals(Object o) {
		Employee other = (Employee) o;
		return empId == other.empId;
	}
	
	@Override
	public int hashCode() {
		return empId;
	}
	
	public static void main(String[] args) {
		Employee employee = new Employee(1, "AXY");
		System.out.println(employee);
		
		{
			Employee e1 = new Employee(1, "ABC");
			Employee e2 = new Employee(1, "ABC");
			Employee e3 = new Employee(2, "XYZ");
			
			System.out.println("Expected true, actual " + (e1.equals(e2)));
			System.out.println("Expected false, actual " + (e1.equals(e3)));
		}
	}
}
