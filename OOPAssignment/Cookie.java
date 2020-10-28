package OOPAssignment;

public class Cookie extends DesertItem{

	private int units;
	private int costperdozen;
	
	public Cookie() {
		
	}
	
	
	public Cookie(String name, int units, int costperdozen) {
		super(name);
		// TODO Auto-generated constructor stub
		this.costperdozen = costperdozen;
		this.units = units;
	}


	@Override
	double returnCost() {
		// TODO Auto-generated method stub
		double dozens = this.units/12;
		return dozens*this.costperdozen;
	}

}
