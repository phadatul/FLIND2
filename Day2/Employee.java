
public class Employee {

//	private static int c= 0;
	private int eid;
	private String ename;
	private double basic_salary;
	private double hra;
	private double medical;
	private double pf;
	private double pt;
	private double gross_salary;
	private double net_salary;

	public Employee() {
//		System.out.println("a");
//		c +=1 ;
//		this.empid = c;
	}

	public Employee(int id, String name, double bsal, double med) {
		this.eid = id;
		this.ename = name;
		this.basic_salary = bsal;
		this.hra = 0.5 * bsal;
		this.medical = med;
		this.pf = 0.12 * bsal;
		this.pt = 200;
		this.gross_salary = basic_salary + hra + med;
		this.net_salary = basic_salary + hra + med - pf - pt;
	}
	
	public double calculategrosssalary()
	{
		this.gross_salary = this.basic_salary + this.hra + this.medical;
		return this.gross_salary;
	}

	public double calculatenetsalary()
	{
		this.net_salary = this.calculategrosssalary() - this.pf - this.pt;
		return this.net_salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", basic_salary=" + basic_salary + ", gross_salary="
				+ gross_salary + ", grosssalary=" + calculategrosssalary() + "]";
	}
	
	
//	public void showdetails() {
//		System.out.println("Employee ID: " + eid);
//		System.out.println("Gross Salary: " + this.gross_salary);
//		System.out.println("Net Salary: " + this.calculatenetsalary());
//	}
	
//	static void mymethod()
//	{
//		System.out.println("employee");
//	}

}
