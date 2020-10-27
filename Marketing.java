
public class Marketing extends Employee{
	public double km,tour, telephone = 1500;
	
	public Marketing(String ename, double medical, double basic_salary,int km)
	{
		super(ename,medical,basic_salary);
		this.km = km;
		tour = km*5;
	}
	
	
	public double calculateGrossSalary()
	{
		return super.calculateGrossSalary() + tour + telephone ;
	}
}
