package Day2_Assignment;

public class Employee {
	private static int counter = 0;
	private int empId;
	private String empName;
	private double basicSalary;
	private double hra;
	private double medical;
	private double pf;
	private static double pt = 200;
	private double netSalary;
	private double grossSalary;

	public Employee() {
		Employee.counter += 1;
		this.empId = Employee.counter;
	}

	public Employee(String empName, double basicSalary, double medical) {
		this();
		this.empName = empName;
		this.basicSalary = basicSalary;
		this.medical = medical;
		this.hra = this.basicSalary / 2;
		this.pf = (12 * this.basicSalary) / 100;
	}

	public double calGrossSalary() {
		this.grossSalary = this.basicSalary + this.hra + this.medical;
		return this.grossSalary;
	}

	public double calnetSalary() {
		this.netSalary = this.grossSalary - (this.pf + Employee.pt);
		return this.netSalary;
	}

	public void displayData() {
		System.out.println("Employee ID: " + this.empId);
		System.out.println("Employee Name: " + this.empName);
		System.out.println("Gross Salary: " + this.calGrossSalary());
		System.out.println("Net Salary: " + this.calnetSalary());
	}
}
