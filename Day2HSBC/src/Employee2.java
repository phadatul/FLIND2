

public class Employee2 {
	
	private double empid;
	private String ename;
	private double basic_salary, hra, medical, pf, pt, net_salary, gross_salary;
	
	/*public Employee(int empid, String ename, double basic_salary, double hra, double medical, double pf, double pt) {
		
		this.empid= empid;
		this.ename= ename;
		this.medical= medical;
		this.basic_salary= basic_salary;
		this.pt= 200;
		this.hra= 0.5 * basic_salary;
		this.pf= 0.12 * basic_salary;
	}*/
	
	public Employee2(String ename, double basic_salary, double medical) {
		
		this.empid= generateID(1.00, 1000000.00);
		this.ename= ename;
		this.medical= medical;
		this.basic_salary= basic_salary;
		this.pt= 200;
		this.hra= 0.5 * basic_salary;
		this.pf= 0.12 * basic_salary;
	}
	
	public Employee2()
	{
		
	}

	public static double generateID(double max, double min) {
		
		double x= (Math.random() * ((max-min)+1))+min;
		return x;
		
	}
	public double calculateGrossSalary() {
		
		this.gross_salary= this.basic_salary+this.hra+this.medical;
		return this.gross_salary;
	}
	
	public double calculateNetSalary() {
		
		this.net_salary= this.calculateGrossSalary()-this.pf-this.pt;
		return this.net_salary;
	}
	
	public void printDetails() {
		
		System.out.println("ID:" +this.empid);
		System.out.println("NAME:" +this.ename);
		System.out.println("SALARY:" +this.basic_salary);
		System.out.println("HRA:" +this.hra);
		System.out.println("NET:" +this.net_salary);
		System.out.println("GROSS:" +this.gross_salary);
		System.out.println("PF:" +this.pf);
		
	}
	
	
}