
public class Employee {
	
	public int empid;
	public String ename;
	public int salary;
		
	public Employee()
	{
		System.out.println("a");
	}
	
	public Employee(int empid, String ename, int salary)
	{
		System.out.println("b");
		
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
	}

	public void printEmp()
	{
		System.out.print(empid + " ");
		System.out.print(ename + " ");
		System.out.println(salary+ " ");		
	}
}
