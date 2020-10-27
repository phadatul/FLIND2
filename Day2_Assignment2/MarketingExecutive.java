package Day2_Assignment2;

public class MarketingExecutive extends Employee{
	public double kmTravelled;
	public double tourAllowance;
	public double telephoneAllowance;
	static {
		System.out.println("here");
	}
	public MarketingExecutive(String empName, double basicSalary, double medical, double kmTravelled) {
		// TODO Auto-generated constructor stub
		super(empName, basicSalary, medical);
		this.kmTravelled = kmTravelled;
		this.tourAllowance = 5;
		this.telephoneAllowance = 1500;
	}
	
	@Override
	public double calGrossSalary() {
		
		return super.calGrossSalary()+this.tourAllowance+this.telephoneAllowance;
	}

}
