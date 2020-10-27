
public class Employee {

	private static int eid = 0;
	private int empid = eid;
	private String ename;
	private double basic_salary;
	private double hra;
	private double medical;
	private double pf;
	private double pt;
	private double gross_salary;
	private double net_salary;
	
	public Employee()
	{
//		System.out.println("a");
		eid +=1 ;
	}
	
	public Employee(String name, double bsal, double med)
	{
//		this.eid = id;
		this();
		this.ename = name;
		this.basic_salary = bsal;
		this.hra = 0.5*bsal;
		this.medical = med;
		this.pf = 0.12*bsal;
		this.pt = 200;
		this.gross_salary = basic_salary + hra + med;
		this.net_salary = basic_salary + hra + med - pf - pt;
	}
	
	public void showdetails()
	{
		System.out.println("Employee ID: " + empid);
		System.out.println("Gross Salary: " + gross_salary);
		System.out.println("Net Salary: " + net_salary);
		
	}

}
