
public class Manager extends Employee {
	
	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowance;
	
	public Manager(int empid, String empName, double basicSalary, double medical) {
		super(empid, empName, basicSalary, medical);
		this.petrolAllowance = 0.08 * this.getBasicSalary();
		this.foodAllowance = 0.08 * this.getBasicSalary();
		this.otherAllowance = 0.08 * this.getBasicSalary();
	}
	
	@Override
	public double calculateGrossSalary() {
		return super.calculateGrossSalary() + this.foodAllowance + this.petrolAllowance + this.otherAllowance;
	}

}
