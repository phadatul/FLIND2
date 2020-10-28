/* Example for Object toString() method */
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
	
	public static void main(String[] args) {
		Employee employee = new Employee(1, "AXY");
		System.out.println(employee);
	}
}
