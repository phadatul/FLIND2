public class Employee {

	private int empid;
	private String ename;
	private double hra, pf, pt, medical, basic_salary, gross_salary, net_salary;
	static int count;

	static {
		count=100;
	}

	public Employee(String ename, double medical, double basic_salary) {
		this();
		this.ename = ename;
		this.medical = medical;
		this.basic_salary = basic_salary;
		this.hra = 0.5 * basic_salary;
		this.pf = 0.12 * basic_salary;
		this.pt = 200;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
		count++;
		this.empid = count;
	}

	public double calculateGrossSalary() {
		this.gross_salary = this.basic_salary + this.hra + this.medical;
		return this.gross_salary;
	}

	public double calculateNetSalary() {
		this.net_salary = this.calculateGrossSalary() - this.pf - this.pt;
		return this.net_salary;
	}
	
	public void printDetails() {
		System.out.println("ID:" + this.empid);
		System.out.println("NAME:" + this.ename);
		System.out.println("GROSS:" + this.calculateGrossSalary());
		System.out.println("NET:" + this.calculateNetSalary());
	}

}