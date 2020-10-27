
public class Employee {
	public int empid;
	public String ename;
	public double bsal,hra,medical,pf,pt=200,nsal,gsal;
	 ;
	
	public Employee()
	{
		
	}
	public Employee(int empid , String ename , int bsal , int medical)
	{	

		this.empid = empid;
		this.ename = ename;
		this.bsal = bsal;
		this.medical = medical;
		hra = 0.5 * bsal;
		pf = 0.12 * bsal;
		gsal = bsal + hra + medical;
		nsal = gsal - (pt+pf);
	}
	public void print()
	{
		System.out.println("ID : "+empid);
		System.out.println("Employee Name : "+ename);
		System.out.println("Basic Salary : "+bsal);
		System.out.println("HRA : "+hra);
		System.out.println("Medical : "+medical);
		System.out.println("PF : "+pf);
		System.out.println("PT : "+pt);
		System.out.println("Net Salary : "+nsal);
		System.out.println("Gross Salary : "+gsal);
	}
}
