
public class MarketingExecutive extends Employee {
	
	private double kilometeres_travelled;
	private double tour_allowance;
	private static double telephone_allowance = 1500;
	
	public MarketingExecutive(int empid, String name, double Medical, double basic_salary,double kilometeres_travelled) {
		super(empid, name, Medical, basic_salary);
		this.kilometeres_travelled = kilometeres_travelled;
		this.tour_allowance = 5 * this.kilometeres_travelled;
	}
	
	public double setNet_salary() 
	{
		return super.setNet_salary();
	}
	
	public double setGross_salary() 
	{
		return super.setGross_salary()+this.tour_allowance+telephone_allowance;
		
	}

	public void printInfo()
	{
		System.out.println("ID: "+super.getEmpid());
		System.out.println("Name: "+super.getName());
		System.out.println("Net_salary: "+setNet_salary());
		System.out.println("Gross_Salary: "+setGross_salary());
	}
	
	
	

}
