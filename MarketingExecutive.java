
public class MarketingExecutive extends Employee {
	private double kilometersTravelled, tourAllowance, telephoneAllowance;

	public MarketingExecutive(String name, int salary, double kilometersTravlled) {
		super(name, salary);
		this.kilometersTravelled = kilometersTravlled;
		this.tourAllowance = 5 * this.kilometersTravelled;
		this.telephoneAllowance = 1500;
	}

	@Override
	public double calcGrossSalary() {
		return super.calcGrossSalary() + this.tourAllowance + this.telephoneAllowance;
	}
}
