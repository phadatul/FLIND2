package Day2_Assignment2;

public class Manager extends Employee{
	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowance;
	private double grossSalary;
	
	public Manager(String empName, double basicSalary, double medical) {
		// TODO Auto-generated constructor stub
		super(empName, basicSalary, medical);
		this.petrolAllowance = 0.08 * super.basicSalary;
		this.foodAllowance = 0.13 * super.basicSalary;
		this.otherAllowance = 0.03 * super.basicSalary;
	}
	
	@Override
	public double calGrossSalary() {
		
		return super.calGrossSalary()+this.petrolAllowance+this.foodAllowance+this.otherAllowance;
	}
	

}
