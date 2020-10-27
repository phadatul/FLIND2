
public class Manager extends Employee {

	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowance;

	public Manager(String empName, double basicSalary, double medicalAllowance) {
		super(empName, basicSalary, medicalAllowance);
		this.petrolAllowance = 0.08 * basicSalary;
		this.foodAllowance = 0.13 * basicSalary;
		this.otherAllowance = 0.03 * basicSalary;
	}

	@Override
	public double calcGrossSalary() {
		return super.calcGrossSalary() + this.petrolAllowance + this.foodAllowance + this.otherAllowance;
	}
}
