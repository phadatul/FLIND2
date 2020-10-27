
public class Employee {
	public int empID;
	public String empName;
	public double basicSalary;
	public double HRA;
	public double medicalAllowance;
	public double providentFund;
	public static double proTax = 200;
	public double netSalary;
	public double grossSalary;

	public Employee() {

	}

	public Employee(int empID, String empName, double basicSalary, double medicalAllowance) {
		this.empID = empID;
		this.empName = empName;
		this.basicSalary = basicSalary;
		this.medicalAllowance = medicalAllowance;
		this.HRA = basicSalary/2;
		providentFund = (basicSalary*12)/100;		
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
