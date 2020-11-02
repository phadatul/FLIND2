
public class MarketingExecutive extends Employee{
	private int kms_travel;
	private double phone_allowance, tour_allowance;

	public MarketingExecutive(String ename, double basic_salary,double medical,int kms_travel)
	{
		super(ename, basic_salary, medical);
		this.kms_travel=kms_travel;
		this.phone_allowance=1500;
		this.tour_allowance=5*this.kms_travel;
	}
	public double grossSalaryCalculate()
	{
		return super.grossSalaryCalculate()+this.tour_allowance+this.phone_allowance;
	}
	
}
