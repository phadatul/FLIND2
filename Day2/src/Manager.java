
public class Manager extends Employee {
	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowance;
	public Manager() {
		
	}
	public Manager(String ename, double basicsalary, double medical) {
		super(ename, basicsalary, medical);
		this.petrolAllowance = 0.08 * basicsalary;
		this.foodAllowance = 0.13 * basicsalary;
		this.otherAllowance = 0.03 * basicsalary;
		
	}
	public double calculateGrossSalary() {
		return super.calculateGrossSalary() + this.petrolAllowance + this.foodAllowance + this.otherAllowance; 
	}
	
}
