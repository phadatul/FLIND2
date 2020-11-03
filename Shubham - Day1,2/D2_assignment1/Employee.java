
public class Employee {
	
	private int empid;
	private	String name;
	private double basic_salary;
	private double HRA;
	private double Medical;
	private double PF;
	private static double PT=200;
	private double net_salary;
	private double gross_salary;
	
	public Employee() {
		System.out.println("Employee is created");		
	}
	
	 public Employee(int empid, String name,double Medical, double basic_salary) {
		this.empid = empid;
		this.name = name;
		this.basic_salary = basic_salary;
		HRA = basic_salary*0.5;
		this.Medical = Medical;
		PF = 0.12 * basic_salary;
		this.net_salary = this.basic_salary+HRA+this.Medical;
		this.gross_salary = this.net_salary-PF-PT;
	}
	 

	public void setNet_salary() {
		this.net_salary = this.basic_salary+HRA+this.Medical ;
	}
	
	public void setGross_salary() {
		this.gross_salary = this.basic_salary+HRA+this.Medical-PF-PT;
	}

	public void printEmp()
	{
		System.out.println("ID: "+empid);
		System.out.println("Name: "+name);
		System.out.println("Net_salary: "+net_salary);
		System.out.println("Gross_Salary: "+gross_salary);
	}
	

}
