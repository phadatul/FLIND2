
public class MarketingExecutive extends Employee {
	private int kilometersTravelled;
	private double tourAllowance;
	private double telephoneAllowance;
	public MarketingExecutive() {
		
	}
	public MarketingExecutive (String ename, double basicsalary, double medical, int kilometersTravelled) {
		super(ename, basicsalary, medical);
		this.kilometersTravelled = kilometersTravelled;
		this.tourAllowance = kilometersTravelled * 5;
		this.telephoneAllowance = 1500;
		
		
	}
	public double calculateGrossSalary() {
		return super.calculateGrossSalary() + this.telephoneAllowance + this.tourAllowance; 
	}
	

}
