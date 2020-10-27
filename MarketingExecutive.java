
public class MarketingExecutive extends Employee {
	private double kmsTravelled, TourAllowance;
	private double TelephoneAllowance=1500;
	
	public MarketingExecutive(){}
	
	public MarketingExecutive(String name, double sal, double med, double kms){
		super(name, sal, med);
		this.kmsTravelled=kms;
		this.TourAllowance=5*kms;
	}
	
	@Override
	public double calculateGrossSal(){
		return (this.BasicSal+this.HRA+this.Medical+this.TourAllowance+this.TelephoneAllowance);
	}
	
	@Override
	public double calculateNetSal(){
		return (this.calculateGrossSal()-(super.getPT()+this.PF));
	}
	
	@Override
	public void EmpDetails(){
		 System.out.println("Employee Name: "+this.EmployeeName);
		 System.out.println("Employee Id: "+ this.EmployeeId);
		 System.out.println("Basic Salary: "+ this.BasicSal);
		 System.out.println("Tour Allowance: "+this.TourAllowance);
		 System.out.println("Telephone Allowance: "+this.TelephoneAllowance);
		 System.out.println("Gross Salary: "+ this.GrossSal);
		 System.out.println("Net Salary: "+ this.NetSal);
	 }
}
