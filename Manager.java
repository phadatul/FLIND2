public class Manager extends Employee{
	public double petrolAll, foodAll, othAll;
	public Manager() {
		super();
	}
	public Manager(String name, int sal, int medical) {
		super(name, sal, medical);
		petrolAll=0.08*this.basicSalary;
		foodAll=0.13*this.basicSalary;
		othAll=0.03*this.basicSalary;
		this.calcGross();
		this.calcNet();
	}
	public void calcGross() {
		this.grossSalary = this.basicSalary + this.HRA + this.medical+this.petrolAll+this.foodAll+this.othAll;
	}
	public void calcNet() {
		this.netSalary = this.basicSalary + this.HRA + this.medical - this.pt - this.pf;		
	}
//	public void printDetails() {
//		System.out.println();
//	}
}