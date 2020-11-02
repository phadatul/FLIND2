
public class Employee {
	private int empid;
	private String ename;
	private double basic_salary;
	private double HRA;
	private double medical;
	private double PF;
	private static double PT=1200;
	private double net_salary;
	private double gross_salary;
	static int count=1000;
	public Employee()
	{
		
	}

	public Employee (String ename, double basic_salary,double medical)
	{
		count++;
		this.empid=count;
		this.ename=ename;
		this.basic_salary=basic_salary;
		this.HRA=0.5*basic_salary;
		this.PF=0.12*basic_salary;
		
	}
	public double grossSalaryCalculate() {
		this.gross_salary=this.basic_salary+this.HRA+this.medical;
		return this.gross_salary; 
	}
	public double netSalaryCalculate()
	{
		this.net_salary=grossSalaryCalculate()-(PF+PT);
		return this.net_salary;
	}
	
	public void printEmp()
	{
		
		System.out.println("ID:"+empid);
		System.out.println("Name:"+ename);
		System.out.println("Gross Salary:"+this.grossSalaryCalculate());
		System.out.println("Net Salary:"+this.netSalaryCalculate());

	}
	public static void method()
	{
		System.out.println("Employee");
	}
	
	
}
