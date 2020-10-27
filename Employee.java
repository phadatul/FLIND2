
public class Employee {
	private int eid;
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
	}
	
	public Employee(int id, String name, double bsal, double med)
	{
		this.eid = id;
		this.ename = name;
		this.basic_salary = bsal;
		this.hra = 0.5*bsal;
		this.medical = med;
		this.pf = 0.12*bsal;
		this.pt = 200;
		this.gross_salary = basic_salary + hra + med;
		this.net_salary = basic_salary + hra + med - pf - pt;
	}
	
	public void showgross()
	{
		System.out.println("Gross Salary: " + gross_salary);
	}

	public void shownet()
	{
		System.out.println("Net Salary: " + net_salary);
	}
}
