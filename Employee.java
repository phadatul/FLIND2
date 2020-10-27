
public class Employee {
	private int empid;
	private String ename;
	private double basic_salary;
	private double HRA;
	private double medical;
	private double PF;
	private double PT;
	private double net_salary;
	private double gross_salary;
	public Employee()
	{
		System.out.println("Default Constructor");
	}

	public Employee (int empid, String ename, double basic_salary,double medical)
	{
		this.empid=empid;
		this.ename=ename;
		this.basic_salary=basic_salary;
		this.HRA=0.5*basic_salary;
		this.PF=0.12*basic_salary;
		this.PT=1200;
		this.gross_salary=basic_salary+HRA+medical;
		this.net_salary= gross_salary -(PT+PF);
		
	}
	
	public void printEmp()
	{
		
		System.out.println("ID:"+empid);
		System.out.println("Name:"+ename);
		System.out.println("Gross Salary:"+gross_salary);
		System.out.println("Net Salary:"+net_salary);

	}
}
