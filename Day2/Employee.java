package Day2;

public class Employee {
	
	public int empid;
	public String ename;
	public int salary;
	
	public static String company_name="HSBC";
	
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("Default constructor");
		//logic to allocate empid automatically
	}
	
	public Employee(int empid, String ename, int salary) {
		this();
		System.out.println("Parametrized constructor");
		this.empid=empid;
		this.ename = ename;
		this.salary = salary;

	}
//	public Employee(int id, String name, int sal) {
//		empid=id;
//		ename = name;
//		salary = sal;
//
//	}
	
	public void printEmp() {
		System.out.println("Employee ID: "+empid);
		System.out.println("Employee Name: " +ename);
		System.out.println("Employee Salary: " +salary);
	}
	

}
