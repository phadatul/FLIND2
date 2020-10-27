
public class MarketingExecutive extends Employee {
	private int kilometers;
	private int tourAllowance;
	private static int telephoneAllowance = 1500;

	public MarketingExecutive(String empName, double basicSalary, double medicalAllowance, int kilometers) {
		super(empName, basicSalary, medicalAllowance);
		this.kilometers = kilometers;
		this.tourAllowance = calcTourAllowance();
	}

	public int calcTourAllowance() {
		this.tourAllowance = 5 * this.kilometers;
		return this.tourAllowance;
	}

	@Override
	public double calcGrossSalary() {
		return super.calcGrossSalary() + this.tourAllowance + this.telephoneAllowance;
	}

}
