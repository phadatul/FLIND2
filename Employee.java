public class Employee {
	
	private int empid;
	private String empName;
	private double basicSalary;
	private double hra;
	private double medical;
	private double pf;
	private static double pt = 200;
	private double netSalary;
	private double grossSalary;
	
	public Employee() {
		
	}
	
	
	public Employee(int empid, String empName, double basicSalary, double medical) {
		this.empid = empid;
		this.empName = empName;
		this.basicSalary = basicSalary;
		this.medical = medical;
		this.hra = 0.5*this.basicSalary;
		this.pf = 0.12*this.basicSalary;
	}
	
	
	public double calculateGrossSalary() {
		this.grossSalary=this.basicSalary+this.hra+this.medical;
		return this.grossSalary;
	}
	
	
	public double calculateNetSalary() {
		this.netSalary=this.grossSalary-this.pf - pt;
		return this.netSalary;
	}
	
	public void printDetails() {
		System.out.println("ID: " + this.empid);
		System.out.println("Name: " + this.empName);
		System.out.println("Gross: " + this.grossSalary);
		System.out.println("Net: " + this.netSalary);
	}
}
