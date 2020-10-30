
public class Manager extends Employee{
	public double petrol,food,other;
	
	public Manager(String ename, double medical, double basic_salary)
	{
		super(ename,medical,basic_salary);
		petrol = 0.08 * basic_salary;
		food = 0.13*basic_salary;
		other = 0.03*basic_salary;
	}
	
	public double calculateGrossSalary()
	{
		return super.calculateGrossSalary() + petrol + food + other;
	}
	
	
	
	
}
