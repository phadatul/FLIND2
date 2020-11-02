package Day2;

public class tryEmployee {
	public int empId;
	public String eName;
	public int salary;
	static String company_name="HSBC";
	
	public tryEmployee() {
		System.out.println("Default");
	}
	public tryEmployee(int empId, String eName) {
		this();
		System.out.println("Employee 2 methods");
		this.empId=empId;
		this.eName=eName;
	}
	public tryEmployee(int empId, String eName, int salary) {
		System.out.println("Employee 3 methods");
		this.empId=empId;
		this.eName=eName;
		this.salary=salary;
	}
	
	public tryEmployee(int empId, String eName, int salary, String company_name) {
		System.out.println("Employee 4 methods");
		this.empId=empId;
		this.eName=eName;
		this.salary=salary;
		tryEmployee.company_name=company_name;
	}
	
	public void printEmp() {
		System.out.println("ID: "+empId);
		System.out.println("Name: "+eName);
		System.out.println("Salary: "+salary);
		System.out.println("Company: "+company_name);
	}
	
}
