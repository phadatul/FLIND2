
public class Employee {
	private int id;
	private String name;
	private double salary;
	private double hra;
	private double medical;
	private double pf;
	private double pt;
	private double net_salary;
	private double gross_salary;
	private static int count = 0; 
	public Employee() {
		this.count++;
		this.id = 10643 + this.count;
		this.pt = 200;
		this.medical = 5000;
	}
	public Employee(String name,int salary) {
		this();
		this.name = name;
		this.salary = salary;
		this.hra = 0.5*this.salary;
		this.pf = 0.12*this.salary;
	}
	public void details() {
		System.out.println("Employee ID : "+this.id);
		System.out.println("Name : "+this.name);
		System.out.println("Base Salary : "+this.salary);
	}
	public double calcGrossSalary() {
		this.gross_salary = this.salary+this.hra+this.medical;
		return this.gross_salary;
	}
	public double calcNetSalary() {
		this.net_salary = this.gross_salary - this.pf - this.pt;
		return this.net_salary;
	}
	public void salary_structure() {
		System.out.println("Gross Salary : "+this.calcGrossSalary());
		System.out.println("Net Salary : "+this.calcNetSalary());
	}
}
