
public class Manager extends Employee {
	private double petrolAllowance, foodAllowance, otherAllowance;

	public Manager(String name, int salary) {
		super(name, salary);
		this.petrolAllowance = 0.08 * salary;
		this.foodAllowance = 0.13 * salary;
		this.otherAllowance = 0.03 * salary;
	}

	public void details() {
		super.details();
		System.out.println("Petrol Allowance : " + this.petrolAllowance);
		System.out.println("Food Allowance : " + this.foodAllowance);
		System.out.println("Other Allowance : " + this.otherAllowance);
	}

	@Override
	public double calcGrossSalary() {
		return super.calcGrossSalary() + this.petrolAllowance + this.foodAllowance + this.otherAllowance;
	}
}
