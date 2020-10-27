
public class Employee {
	private int empID;
	private String empName;
	private double basicSalary;
	private double HRA;
	private double medicalAllowance;
	private double providentFund;
	private static double proTax = 200;
	private double netSalary;
	private double grossSalary;
	private static int count = 3000;

	public Employee() {
		this.empID = count;
		count++;
	}

	public Employee(String empName, double basicSalary, double medicalAllowance) {
		this();
		this.empName = empName;
		this.basicSalary = basicSalary;
		this.medicalAllowance = medicalAllowance;
		this.HRA = basicSalary/2;
		this.providentFund = (basicSalary*12)/100;		
	}

	public void printEmp() {
		System.out.println("ID : " + empID);
		System.out.println("Name : " + empName);
		System.out.println("Gross Salary : " + this.calcGrossSalary());
		System.out.println("Net Salary : " + this.calcNetSalary());
	}
	
	public double calcGrossSalary() {
		this.grossSalary = this.basicSalary + this.HRA + this.medicalAllowance; 
		return this.grossSalary;		
	}
	
	public double calcNetSalary() {
		this.netSalary = (this.grossSalary - (proTax + this.providentFund));
		return this.netSalary;	
	}

}
