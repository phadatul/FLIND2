
public class Manager extends Employee {
	private double PetrolAllowance, FoodAllowance, OtherAllowance;
	
	public Manager(){};
	
	public Manager(String name, double sal, double med, double p, double f, double o){
		super(name, sal, med);
		this.PetrolAllowance=0.08*this.BasicSal;
		this.FoodAllowance=0.13*this.BasicSal;
		this.OtherAllowance=0.03*this.BasicSal;
	}	
	
	@Override
	public double calculateGrossSal(){
		return (this.BasicSal+this.HRA+this.Medical+this.PetrolAllowance+this.FoodAllowance+this.OtherAllowance);
	}
	
	@Override
	public double calculateNetSal(){
		return (this.calculateGrossSal()-(super.getPT()+this.PF));
	}
	
	@Override
	public void EmpDetails(){
		super.EmpDetails();
		System.out.println("Petrol Allowance: "+this.PetrolAllowance);
		System.out.println("Food Allowance: "+ this.FoodAllowance);
		System.out.println("Other Allowance: "+this.OtherAllowance);
	 }
}
