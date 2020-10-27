package Day2_Assignment;

public class Manager extends Employee{
	
	double petrol_allowance;
	double food_allowance;
	double other_allowance;
	public Manager(String ename, double basic_sal, double medical) {
		// TODO Auto-generated constructor stub
		super(ename,basic_sal, medical);
		
		this.petrol_allowance = this.basic_sal*0.08;
		this.food_allowance = this.basic_sal*0.13;
		this.other_allowance = this.basic_sal*0.03;
	}
	
	@Override
	public double calculateGrossSalary() {
		// TODO Auto-generated method stub
		return super.calculateGrossSalary() +this.gross_sal+this.petrol_allowance+this.food_allowance+this.other_allowance;
		//return this.gross_sal;
	}

}
