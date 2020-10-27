
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
	 
	 
	 

	public int getEmpid() {
		return empid;
	}

	public String getName() {
		return name;
	}

	public double getBasic_salary() {
		return basic_salary;
	}

	public double getHRA() {
		return HRA;
	}

	public double getMedical() {
		return Medical;
	}

	public double getPF() {
		return PF;
	}

	public static double getPT() {
		return PT;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBasic_salary(double basic_salary) {
		this.basic_salary = basic_salary;
	}

	public void setHRA(double hRA) {
		HRA = hRA;
	}

	public void setMedical(double medical) {
		Medical = medical;
	}

	public void setPF(double pF) {
		PF = pF;
	}

	public static void setPT(double pT) {
		PT = pT;
	}

	public double setNet_salary() {
		this.net_salary = this.basic_salary+HRA+this.Medical ;
		return this.net_salary;
	}
	
	public double setGross_salary() {
		this.gross_salary = this.basic_salary+HRA+this.Medical-this.PF-PT;
		return this.gross_salary;
	}

	public void printInfo()
	{
		System.out.println("ID: "+empid);
		System.out.println("Name: "+name);
		System.out.println("Net_salary: "+setNet_salary());
		System.out.println("Gross_Salary: "+setGross_salary());
	}
	

}
