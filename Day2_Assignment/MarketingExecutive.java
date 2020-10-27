package Day2_Assignment;

public class MarketingExecutive extends Employee{
	
	double tour_allowance;
	double km_travelled;
	double phone_allowance;
	public MarketingExecutive(String ename, double basic_sal, double medical,int km_travelled) {
		// TODO Auto-generated constructor stub
		super(ename, basic_sal, medical);
		
		this.km_travelled = km_travelled;
		this.tour_allowance = 5*this.km_travelled;
		this.phone_allowance = 1500;
	}
	
	
	@Override
	public double calculateGrossSalary() {
		// TODO Auto-generated method stub
		return super.calculateGrossSalary() +this.gross_sal+this.tour_allowance+this.phone_allowance;
		//return this.gross_sal;
	}

}
