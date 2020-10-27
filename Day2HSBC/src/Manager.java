
public class Manager extends Employee2 {
	
	private double petrol_allowance;
	private double food_allowance;
	private double other_allowance;
	
	public Manager(String ename, double basic_salary, double medical) {
		
		super(ename, basic_salary, medical);
		this.petrol_allowance= 0.08 * basic_salary;
		this.food_allowance= 0.13 * basic_salary;
		this.other_allowance= 0.03 * basic_salary;
	}
	
	public void printDetails() {
		
		super.printDetails();
		System.out.println("PETROL ALLOWANCE: " +this.petrol_allowance);
		System.out.println("FOOD ALLOWANCE: " +this.food_allowance);
		System.out.println("OTHER ALLOWANCE: " +this.other_allowance);
	
	}
	
	public double calculateGrossSalary() {
		
		return super.calculateGrossSalary() + this.petrol_allowance + this.food_allowance + this.other_allowance;
				
	}
	
}