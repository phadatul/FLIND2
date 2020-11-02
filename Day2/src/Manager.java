
public class Manager extends Employee {
	private double petrol_allowance,food_allowance,other_allowance;
	public Manager(String ename, double basic_salary,double medical)
	{
		super(ename, basic_salary,medical);
		this.petrol_allowance=basic_salary*0.08;
		this.food_allowance=basic_salary*0.13;
		this.other_allowance=basic_salary*0.03;
		
	}
	
	@Override
	public double grossSalaryCalculate()
	{
		return super.grossSalaryCalculate()+this.petrol_allowance+this.food_allowance+this.other_allowance;
	}
	public static void method()
	{
		System.out.println("Manager");
	}

}
