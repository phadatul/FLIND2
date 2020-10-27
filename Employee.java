
public class Employee {
	public int eid;
	public String ename;
	public double basic_salary;
	public double hra;
	public double medical;
	public double pf;
	public double pt;
	public double gross_salary;
	public double net_salary;

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
