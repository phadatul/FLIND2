public class MarketingExecutive extends Employee{
	public double kms, tourAll, telAll;
	public MarketingExecutive() {
		super();
	}
	public MarketingExecutive(String name, int sal, int medical, int kms) {
		super(name, sal, medical);
		this.kms=kms;
		tourAll=5*this.kms;
		telAll=1500;
		this.calcGross();
		this.calcNet();
	}
	public void calcGross() {
		this.grossSalary = this.basicSalary + this.HRA + this.medical+this.telAll+this.tourAll;
	}
	public void calcNet() {
		this.netSalary = this.basicSalary + this.HRA + this.medical - this.pt - this.pf;		
	}
//	public void printDetails() {
//		System.out.println();
//	}
}

