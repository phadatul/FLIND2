
public class Manager extends Employee{
	
	private double petrol_allowance;
	private double food_allowance;
	private double other_allowance;
	
	public Manager(int empid, String name, double Medical, double basic_salary) {
		super(empid, name, Medical, basic_salary);
		this.petrol_allowance = 0.08*super.getBasic_salary();
		this.food_allowance = 0.13*super.getBasic_salary();
		this.other_allowance = 0.03*super.getBasic_salary();	
	}
	
	public double setNet_salary() 
	{
		return super.setNet_salary();
	}
	
	public double setGross_salary() 
	{
		return super.setGross_salary()+this.petrol_allowance+this.food_allowance+this.other_allowance;
		
	}

	public void printInfo()
	{
		System.out.println("ID: "+super.getEmpid());
		System.out.println("Name: "+super.getName());
		System.out.println("Net_salary: "+setNet_salary());
		System.out.println("Gross_Salary: "+setGross_salary());
	}
	
	

}
