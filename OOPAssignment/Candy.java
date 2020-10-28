package OOPAssignment;

public class Candy extends DesertItem{
	
	private int weight;
	private int cost;
	
	public Candy()
	{
		
	}

	public Candy(String name, int weight, int cost) {
		super(name);
		// TODO Auto-generated constructor stub
		//this.name = name;
		this.weight = weight;
		this.cost = cost;
	}

	@Override
	double returnCost() {
		// TODO Auto-generated method stub
		double weightinkgs = this.weight/1000;
		double costinkgs = weightinkgs*this.cost;
		return Math.round(costinkgs);
		
	}

}
