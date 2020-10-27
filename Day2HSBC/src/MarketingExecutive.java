
public class MarketingExecutive extends Employee2 {
	
	private double kms_travel;
	private double tour_allowance;
	private double telephone_allowance;
	
	public MarketingExecutive(String ename, double basic_salary, double medical, double kms_travel) {
		
		super(ename, basic_salary, medical);
		this.kms_travel= kms_travel;
		this.tour_allowance= 5.0;
		this.telephone_allowance= 1500.00;
	}
	
	public double calculateGrossSalary() {
		
		return super.calculateGrossSalary() + this.tour_allowance + this.telephone_allowance;
	}
}