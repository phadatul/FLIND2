
public class Employee {
	private int id;
	private String name;
	private double salary;
	private double hra;
	private double medical;
	private double pf;
	private double pt;
	private static int count = 0;

	public Employee() {
		count++;
		this.id = 10643 + count;
		this.pt = 200;
		this.medical = 5000;
	}

	public Employee(String name, int salary) {
		this();
		this.name = name;
		this.salary = salary;
		this.hra = 0.5 * this.salary;
		this.pf = 0.12 * this.salary;
	}

	public void details() {
		System.out.println("Employee ID : " + this.id);
		System.out.println("Name : " + this.name);
		System.out.println("Base Salary : " + this.salary);
	}

	public double calcGrossSalary() {
		return this.salary + this.hra + this.medical;
	}

	public double calcNetSalary() {
		return this.salary + this.hra + this.medical - this.pf - this.pt;
	}

	public void salary_structure() {
		System.out.println("Gross Salary : " + this.calcGrossSalary());
		System.out.println("Net Salary : " + this.calcNetSalary());
	}
}
