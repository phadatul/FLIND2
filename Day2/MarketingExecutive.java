
public class MarketingExecutive extends Employee {

	int kmstravelled, tourallow, phoneallow;
	
	public MarketingExecutive() {

	}

	public MarketingExecutive(int id, String name, double bsal, double med, int kmstravelled) {
		super(id, name, bsal, med);
		this.kmstravelled = kmstravelled;
		this.phoneallow = 1500;
		this.tourallow = 5*kmstravelled;
	}
	
	@Override
	public double calculategrosssalary() {
		// TODO Auto-generated method stub
		return super.calculategrosssalary() + this.tourallow + this.phoneallow;
	}
	
	@Override
	public double calculatenetsalary() {
		// TODO Auto-generated method stub
		return super.calculatenetsalary();
	}

}
