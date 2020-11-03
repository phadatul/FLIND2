
public class Manager extends Employee {

	private double petrolAllowance, foodAllowance, otherAllowance;

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(String ename, double medical, double basic_salary) {
		super(ename, medical, basic_salary);
		this.petrolAllowance = 0.08 * basic_salary;
		this.foodAllowance = 0.13 * basic_salary;
		this.otherAllowance = 0.03 * basic_salary;
	}

	@Override
	public double calculateGrossSalary() {

		return super.calculateGrossSalary() + this.foodAllowance + this.otherAllowance + this.petrolAllowance;
	}

}
