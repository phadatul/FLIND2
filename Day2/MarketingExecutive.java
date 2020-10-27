public class MarketingExecutive extends Employee{
	
	private double kilometersTravelled;
	private double travelAllowance;
	private static double telephoneAllowance = 1500;
	
	public MarketingExecutive(int empid, String empName, double basicSalary, double medical, double km) {
		super(empid, empName, basicSalary, medical);
		this.kilometersTravelled = km;
		this.travelAllowance = 5 * this.kilometersTravelled;
	}
	
	@Override
	public double calculateGrossSalary() {
		return super.calculateGrossSalary() + this.travelAllowance + telephoneAllowance;
	}
}
