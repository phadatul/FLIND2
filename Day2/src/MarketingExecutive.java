
public class MarketingExecutive extends Employee {
	private int kms_travelled;
	private double phoneAllownace, tourAllowance;

	public MarketingExecutive() {
		// TODO Auto-generated constructor stub
	}

	public MarketingExecutive(String ename, double medical, double basic_salary, int kms_travelled) {
		super(ename, medical, basic_salary);
		this.phoneAllownace = 1500;
		this.kms_travelled=kms_travelled;
		this.tourAllowance = 5 * kms_travelled;
	}

	@Override
	public double calculateGrossSalary() {
		// TODO Auto-generated method stub
		return super.calculateGrossSalary() + this.tourAllowance + this.phoneAllownace;
	}

}
