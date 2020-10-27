
public class Manager extends Employee {

	private double petrolallow, foodallow, otherallow;

	public Manager() {

	}

	public Manager(int id, String name, double bsal, double med) {
		super(id, name, bsal, med);
		this.petrolallow = 0.08 * bsal;
		this.foodallow = 0.13 * bsal;
		this.otherallow = 0.03 * bsal;	
	}

	@Override
	public double calculategrosssalary() {
		// TODO Auto-generated method stub
		return super.calculategrosssalary() + this.foodallow + this.otherallow + this.petrolallow;
	}
}
