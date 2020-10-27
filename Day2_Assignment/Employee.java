package Day2_Assignment;

public class Employee {
	
	int empid;
	String ename;
	double basic_sal;
	double hra;
	double medical;
	double pf;
	double pt;
	double net_sal;
	double gross_sal;
	
	static int id_counter = 0;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("Default Constructor");
		id_counter++;
		this.empid = id_counter;
		
	}
	
	public Employee(String ename, double basic_sal, double medical)
	{
		this();
		System.out.println("Parametrized Constructor");
		//this.empid = empid;
		this.ename = ename;
		this.basic_sal = basic_sal;
		this.medical = medical;
		
		this.hra = this.basic_sal*0.5;
		this.pf = this.basic_sal*0.12;
		this.pt = 200;
		this.gross_sal = this.basic_sal + this.hra+ this.medical;
		this.net_sal = this.gross_sal-(this.pf+this.pt);
				
	}
	
	public void displayData()
	{
		System.out.println("Employee ID: "+ this.empid);
		System.out.println("Employee Name: " +this.ename);
		System.out.println("Gross Salary: "+ this.gross_sal);
		System.out.println("Net Salary: "+ this.net_sal);
	}
	


}
